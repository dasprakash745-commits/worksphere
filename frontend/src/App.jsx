import { useEffect, useState } from 'react'
import './App.css'

function App() {

  const [health, setHealth] = useState(null)
  const [error, setError] = useState(null)

  useEffect(() => {

    fetch('/api/v1/health')
      .then(response => {

        if (!response.ok) {
          throw new Error('Backend API request failed')
        }

        return response.json()
      })
      .then(data => {
        setHealth(data)
      })
      .catch(error => {
        setError(error.message)
      })

  }, [])

  return (
    <div className="app">

      <header className="header">
        <h1>WorkSphere</h1>
        <span>Project Management Platform</span>
      </header>

      <main className="dashboard">

        <h2>Welcome to WorkSphere</h2>

        <p>
          Manage your projects, teams and tasks
          from one place.
        </p>

        <div className="status-card">

          <h3>Backend Connection</h3>

          {health && (
            <div className="success">
              <span>●</span> Connected
              <p>Application: {health.application}</p>
              <p>Status: {health.status}</p>
            </div>
          )}

          {error && (
            <div className="error">
              Backend unavailable: {error}
            </div>
          )}

          {!health && !error && (
            <p>Checking backend connection...</p>
          )}

        </div>

      </main>

    </div>
  )
}

export default App