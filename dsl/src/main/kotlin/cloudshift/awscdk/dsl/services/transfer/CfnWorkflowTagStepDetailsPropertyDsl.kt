@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.transfer.CfnWorkflow

/**
 * Details for a step that creates one or more tags.
 *
 * You specify one or more tags. Each tag contains a key-value pair.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * TagStepDetailsProperty tagStepDetailsProperty = TagStepDetailsProperty.builder()
 * .name("name")
 * .sourceFileLocation("sourceFileLocation")
 * .tags(List.of(S3TagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-tagstepdetails.html)
 */
@CdkDslMarker
public class CfnWorkflowTagStepDetailsPropertyDsl {
  private val cdkBuilder: CfnWorkflow.TagStepDetailsProperty.Builder =
      CfnWorkflow.TagStepDetailsProperty.builder()

  private val _tags: MutableList<CfnWorkflow.S3TagProperty> = mutableListOf()

  /**
   * @param name The name of the step, used as an identifier.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param sourceFileLocation Specifies which file to use as input to the workflow step: either the
   * output from the previous step, or the originally uploaded file for the workflow.
   * * To use the previous file as the input, enter `${previous.file}` . In this case, this workflow
   * step uses the output file from the previous workflow step as input. This is the default value.
   * * To use the originally uploaded file location as input for this step, enter `${original.file}`
   * .
   */
  public fun sourceFileLocation(sourceFileLocation: String) {
    cdkBuilder.sourceFileLocation(sourceFileLocation)
  }

  /**
   * @param tags Array that contains from 1 to 10 key/value pairs.
   */
  public fun tags(tags: CfnWorkflowS3TagPropertyDsl.() -> Unit) {
    _tags.add(CfnWorkflowS3TagPropertyDsl().apply(tags).build())
  }

  /**
   * @param tags Array that contains from 1 to 10 key/value pairs.
   */
  public fun tags(tags: Collection<CfnWorkflow.S3TagProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnWorkflow.TagStepDetailsProperty {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
