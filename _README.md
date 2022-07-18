# Heading 1
## Heading 2
### Heading 3
#### Heading 4
##### Heading 5
###### Heading 6

This is a paragraph with some text.This is a paragraph with some text.
This is a *paragraph* with some text.<br>
This is a **paragraph** with some text.

This is a paragraph with some text.


visit [google.lk]

- [ ] To-do-1
- [x] To-do-2

### Instruction to run the application
- `java AppInitilizer` to run the application



~~~java
public void handle(ActionEvent actionEvent) {
                URL resource = this.getClass().getResource("/view/TextEditorForm.fxml");
                try {
                    Parent container = FXMLLoader.load(resource);
                    Scene scene = new Scene(container);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Banda's Text Editor");
                    stage.show();
                    stage.centerOnScreen();
                    lblStatus.getScene().getWindow().hide();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        });
~~~

- one
- two
- three
  - four
  - five

* first
* second
* third

1. one
2. two
3. three

![](chrome://branding/content/firefox-wordmark.svg)
