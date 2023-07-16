@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.panorama.CfnPackage
import software.amazon.awscdk.services.panorama.CfnPackageProps

@CdkDslMarker
public class CfnPackagePropsDsl {
  private val cdkBuilder: CfnPackageProps.Builder = CfnPackageProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun packageName(packageName: String) {
    cdkBuilder.packageName(packageName)
  }

  public fun storageLocation(storageLocation: IResolvable) {
    cdkBuilder.storageLocation(storageLocation)
  }

  public fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty) {
    cdkBuilder.storageLocation(storageLocation)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPackageProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
