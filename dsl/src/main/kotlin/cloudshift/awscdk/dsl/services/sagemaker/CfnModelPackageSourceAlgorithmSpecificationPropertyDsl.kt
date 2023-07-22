@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageSourceAlgorithmSpecificationPropertyDsl {
  private val cdkBuilder: CfnModelPackage.SourceAlgorithmSpecificationProperty.Builder =
      CfnModelPackage.SourceAlgorithmSpecificationProperty.builder()

  private val _sourceAlgorithms: MutableList<Any> = mutableListOf()

  /**
   * @param sourceAlgorithms A list of the algorithms that were used to create a model package. 
   */
  public fun sourceAlgorithms(vararg sourceAlgorithms: Any) {
    _sourceAlgorithms.addAll(listOf(*sourceAlgorithms))
  }

  /**
   * @param sourceAlgorithms A list of the algorithms that were used to create a model package. 
   */
  public fun sourceAlgorithms(sourceAlgorithms: Collection<Any>) {
    _sourceAlgorithms.addAll(sourceAlgorithms)
  }

  /**
   * @param sourceAlgorithms A list of the algorithms that were used to create a model package. 
   */
  public fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
    cdkBuilder.sourceAlgorithms(sourceAlgorithms)
  }

  public fun build(): CfnModelPackage.SourceAlgorithmSpecificationProperty {
    if(_sourceAlgorithms.isNotEmpty()) cdkBuilder.sourceAlgorithms(_sourceAlgorithms)
    return cdkBuilder.build()
  }
}
