@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.transfer.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowTagStepDetailsPropertyDsl {
  private val cdkBuilder: CfnWorkflow.TagStepDetailsProperty.Builder =
      CfnWorkflow.TagStepDetailsProperty.builder()

  private val _tags: MutableList<CfnWorkflow.S3TagProperty> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun sourceFileLocation(sourceFileLocation: String) {
    cdkBuilder.sourceFileLocation(sourceFileLocation)
  }

  public fun tags(tags: CfnWorkflowS3TagPropertyDsl.() -> Unit) {
    _tags.add(CfnWorkflowS3TagPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnWorkflow.S3TagProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnWorkflow.TagStepDetailsProperty {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
