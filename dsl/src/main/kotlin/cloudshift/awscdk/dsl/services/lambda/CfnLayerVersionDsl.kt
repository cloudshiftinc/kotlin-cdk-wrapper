@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnLayerVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnLayerVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLayerVersion.Builder = CfnLayerVersion.Builder.create(scope, id)

  private val _compatibleArchitectures: MutableList<String> = mutableListOf()

  private val _compatibleRuntimes: MutableList<String> = mutableListOf()

  public fun compatibleArchitectures(vararg compatibleArchitectures: String) {
    _compatibleArchitectures.addAll(listOf(*compatibleArchitectures))
  }

  public fun compatibleArchitectures(compatibleArchitectures: Collection<String>) {
    _compatibleArchitectures.addAll(compatibleArchitectures)
  }

  public fun compatibleRuntimes(vararg compatibleRuntimes: String) {
    _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
  }

  public fun compatibleRuntimes(compatibleRuntimes: Collection<String>) {
    _compatibleRuntimes.addAll(compatibleRuntimes)
  }

  public fun content(content: IResolvable) {
    cdkBuilder.content(content)
  }

  public fun content(content: CfnLayerVersion.ContentProperty) {
    cdkBuilder.content(content)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun layerName(layerName: String) {
    cdkBuilder.layerName(layerName)
  }

  public fun licenseInfo(licenseInfo: String) {
    cdkBuilder.licenseInfo(licenseInfo)
  }

  public fun build(): CfnLayerVersion {
    if(_compatibleArchitectures.isNotEmpty())
        cdkBuilder.compatibleArchitectures(_compatibleArchitectures)
    if(_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
    return cdkBuilder.build()
  }
}
