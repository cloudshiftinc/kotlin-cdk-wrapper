@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnAppBlock
import software.amazon.awscdk.services.appstream.CfnAppBlockProps

@CdkDslMarker
public class CfnAppBlockPropsDsl {
  private val cdkBuilder: CfnAppBlockProps.Builder = CfnAppBlockProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun packagingType(packagingType: String) {
    cdkBuilder.packagingType(packagingType)
  }

  public fun postSetupScriptDetails(postSetupScriptDetails: IResolvable) {
    cdkBuilder.postSetupScriptDetails(postSetupScriptDetails)
  }

  public fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty) {
    cdkBuilder.postSetupScriptDetails(postSetupScriptDetails)
  }

  public fun setupScriptDetails(setupScriptDetails: IResolvable) {
    cdkBuilder.setupScriptDetails(setupScriptDetails)
  }

  public fun setupScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty) {
    cdkBuilder.setupScriptDetails(setupScriptDetails)
  }

  public fun sourceS3Location(sourceS3Location: IResolvable) {
    cdkBuilder.sourceS3Location(sourceS3Location)
  }

  public fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty) {
    cdkBuilder.sourceS3Location(sourceS3Location)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAppBlockProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
