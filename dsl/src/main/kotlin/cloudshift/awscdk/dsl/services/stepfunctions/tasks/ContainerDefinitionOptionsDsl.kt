@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions
import software.amazon.awscdk.services.stepfunctions.tasks.DockerImage
import software.amazon.awscdk.services.stepfunctions.tasks.Mode
import software.amazon.awscdk.services.stepfunctions.tasks.S3Location

@CdkDslMarker
public class ContainerDefinitionOptionsDsl {
  private val cdkBuilder: ContainerDefinitionOptions.Builder = ContainerDefinitionOptions.builder()

  public fun containerHostName(containerHostName: String) {
    cdkBuilder.containerHostName(containerHostName)
  }

  public fun environmentVariables(environmentVariables: TaskInput) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  public fun image(image: DockerImage) {
    cdkBuilder.image(image)
  }

  public fun mode(mode: Mode) {
    cdkBuilder.mode(mode)
  }

  public fun modelPackageName(modelPackageName: String) {
    cdkBuilder.modelPackageName(modelPackageName)
  }

  public fun modelS3Location(modelS3Location: S3Location) {
    cdkBuilder.modelS3Location(modelS3Location)
  }

  public fun build(): ContainerDefinitionOptions = cdkBuilder.build()
}
