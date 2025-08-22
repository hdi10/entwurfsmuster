# Design Patterns – Übersicht

## Erzeugungsmuster
- [Singleton](patterns/gof-01-singleton.md)
# - Factory Method (coming soon)
# - Abstract Factory (coming soon)
# - Builder (coming soon)
# - Prototype (coming soon)

## Strukturmuster
- (coming soon)

## Verhaltensmuster
- (coming soon)

```mermaid
%% include from docs/assets/singleton-sequence.mmd
sequenceDiagram
    participant Client
    participant Singleton
    Client->>Singleton: getInstance()
    alt Instance exists?
        Singleton-->>Client: return existing instance
    else Create new
        Singleton->>Singleton: create instance
        Singleton-->>Client: return new instance
    end