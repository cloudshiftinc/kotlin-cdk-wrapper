@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resiliencehub.CfnApp

@CdkDslMarker
public class CfnAppResourceMappingPropertyDsl {
  private val cdkBuilder: CfnApp.ResourceMappingProperty.Builder =
      CfnApp.ResourceMappingProperty.builder()

  public fun eksSourceName(eksSourceName: String) {
    cdkBuilder.eksSourceName(eksSourceName)
  }

  public fun logicalStackName(logicalStackName: String) {
    cdkBuilder.logicalStackName(logicalStackName)
  }

  public fun mappingType(mappingType: String) {
    cdkBuilder.mappingType(mappingType)
  }

  public fun physicalResourceId(physicalResourceId: IResolvable) {
    cdkBuilder.physicalResourceId(physicalResourceId)
  }

  public fun physicalResourceId(physicalResourceId: CfnApp.PhysicalResourceIdProperty) {
    cdkBuilder.physicalResourceId(physicalResourceId)
  }

  public fun resourceName(resourceName: String) {
    cdkBuilder.resourceName(resourceName)
  }

  public fun terraformSourceName(terraformSourceName: String) {
    cdkBuilder.terraformSourceName(terraformSourceName)
  }

  public fun build(): CfnApp.ResourceMappingProperty = cdkBuilder.build()
}
