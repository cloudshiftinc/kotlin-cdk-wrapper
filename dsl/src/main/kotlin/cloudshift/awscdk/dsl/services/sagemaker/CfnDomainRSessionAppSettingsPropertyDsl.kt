@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain

@CdkDslMarker
public class CfnDomainRSessionAppSettingsPropertyDsl {
  private val cdkBuilder: CfnDomain.RSessionAppSettingsProperty.Builder =
      CfnDomain.RSessionAppSettingsProperty.builder()

  private val _customImages: MutableList<Any> = mutableListOf()

  /**
   * @param customImages A list of custom SageMaker images that are configured to run as a RSession
   * app.
   */
  public fun customImages(vararg customImages: Any) {
    _customImages.addAll(listOf(*customImages))
  }

  /**
   * @param customImages A list of custom SageMaker images that are configured to run as a RSession
   * app.
   */
  public fun customImages(customImages: Collection<Any>) {
    _customImages.addAll(customImages)
  }

  /**
   * @param customImages A list of custom SageMaker images that are configured to run as a RSession
   * app.
   */
  public fun customImages(customImages: IResolvable) {
    cdkBuilder.customImages(customImages)
  }

  /**
   * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version,
   * and the instance type that the version runs on.
   */
  public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  /**
   * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version,
   * and the instance type that the version runs on.
   */
  public fun defaultResourceSpec(defaultResourceSpec: CfnDomain.ResourceSpecProperty) {
    cdkBuilder.defaultResourceSpec(defaultResourceSpec)
  }

  public fun build(): CfnDomain.RSessionAppSettingsProperty {
    if(_customImages.isNotEmpty()) cdkBuilder.customImages(_customImages)
    return cdkBuilder.build()
  }
}
