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

  public fun sourceAlgorithms(vararg sourceAlgorithms: Any) {
    _sourceAlgorithms.addAll(listOf(*sourceAlgorithms))
  }

  public fun sourceAlgorithms(sourceAlgorithms: Collection<Any>) {
    _sourceAlgorithms.addAll(sourceAlgorithms)
  }

  public fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
    cdkBuilder.sourceAlgorithms(sourceAlgorithms)
  }

  public fun build(): CfnModelPackage.SourceAlgorithmSpecificationProperty {
    if(_sourceAlgorithms.isNotEmpty()) cdkBuilder.sourceAlgorithms(_sourceAlgorithms)
    return cdkBuilder.build()
  }
}
