# TP8

# Exercice 1 - Système de paiement extensible (interfaces)

- On construit un système de paiement extensible en s'appuyant sur une interface plutôt que sur l'héritage.
- L'interface PaymentMethod définit le contrat commun à tout moyen de paiement : payer un montant (pay), rembourser un montant (refund), et se présenter (getName). L'interface ne contient aucune implémentation, elle impose seulement ce que chaque moyen de paiement doit savoir faire.
- CreditCard, PayPal et Bitcoin implémentent chacune l'interface PaymentMethod avec leurs propres attributs (numéro de carte, email, adresse de portefeuille) et leur propre logique de paiement et de remboursement.
- La classe PaymentProcessor gère un tableau dynamique de PaymentMethod qui s'agrandit automatiquement, et traite les paiements en demandant à chaque méthode de payer un montant puis de rembourser la moitié.
- Le point essentiel de cet exercice est le découplage : PaymentProcessor ne connaît que le contrat PaymentMethod, jamais les détails internes de CreditCard, PayPal ou Bitcoin. Ajouter un nouveau moyen de paiement (par exemple ApplePay) ne nécessite aucune modification du processeur, uniquement la création d'une nouvelle classe qui implémente l'interface.

<img width="1280" height="672" alt="1" src="https://github.com/user-attachments/assets/eba983c3-1234-401a-9ff9-9f092453f9e8" />

<img width="1280" height="669" alt="12" src="https://github.com/user-attachments/assets/4f98e944-06a7-4292-bb72-838c04b920ed" />

<img width="1278" height="670" alt="13" src="https://github.com/user-attachments/assets/58ce6e78-80e7-4f44-9ab2-7e9ff81180fa" />

<img width="1280" height="672" alt="14" src="https://github.com/user-attachments/assets/ea4ecb26-cd0d-462b-9b1e-6b6bd3909b24" />

<img width="1280" height="672" alt="15" src="https://github.com/user-attachments/assets/0497be18-971a-4b3a-a13b-c53d02d4cbbe" />

<img width="1280" height="672" alt="16" src="https://github.com/user-attachments/assets/929fe293-b931-4f2e-b43c-86a918e1edd4" />

<img width="1280" height="670" alt="17" src="https://github.com/user-attachments/assets/70549bc3-af21-424f-945d-392173d51689" />

<img width="1280" height="670" alt="18" src="https://github.com/user-attachments/assets/7da46a4a-7f74-4bf0-b43d-ff7b3ec33e62" />

<img width="1280" height="669" alt="19" src="https://github.com/user-attachments/assets/de5cdbaa-06b9-490d-b3f4-a0163c4095fb" />

https://github.com/user-attachments/assets/0f917437-5f2b-4611-abb6-0e4bc9e1e27a


# Exercice 2 - Système de notification extensible (interfaces + tri)

- On modélise un système de diffusion de notifications à travers plusieurs canaux qui respectent tous le même contrat.
- L'interface Notification impose trois comportements à tout canal : envoyer un message (send), indiquer sa priorité (getPriority, de 0 pour basse à 2 pour haute), et indiquer son type (getType).
- EmailNotification, SMSNotification et PushNotification implémentent chacune l'interface avec leur propre logique d'envoi et leur propre niveau de priorité fixe.
- La classe NotificationManager stocke un tableau dynamique de canaux qui s'agrandit automatiquement, et diffuse un message à tous les canaux enregistrés après les avoir triés par priorité décroissante, afin que les canaux les plus urgents (comme le SMS) soient traités en premier.
- Comme dans l'exercice précédent, le gestionnaire ne connaît jamais les détails d'implémentation de chaque canal : il se contente d'appeler les méthodes définies par l'interface. Ajouter un nouveau canal (par exemple SlackNotification) ne demande aucune modification du gestionnaire, ce qui illustre à nouveau le principe Open/Closed.

<img width="1280" height="605" alt="2" src="https://github.com/user-attachments/assets/5a3d259a-bcf3-4bf6-ac76-22b06f1d3a23" />

<img width="1280" height="670" alt="21" src="https://github.com/user-attachments/assets/324d1788-ae48-4136-970f-7b7ca81eea7f" />

<img width="1280" height="576" alt="22" src="https://github.com/user-attachments/assets/3e4504e2-4f56-43f2-8ef9-0e63a21e8dd2" />

<img width="1280" height="669" alt="23" src="https://github.com/user-attachments/assets/827a9357-32f2-4072-9fc8-8032936702a6" />

<img width="1278" height="577" alt="24 3" src="https://github.com/user-attachments/assets/4f5fc83b-d1cd-4f65-9dfa-6cba8306edbd" />

<img width="1280" height="651" alt="25" src="https://github.com/user-attachments/assets/92974c41-594d-4e2a-961c-4d7b97e88ea9" />

https://github.com/user-attachments/assets/7dd6342b-770a-45b5-bb97-0b01fae0f0f5
