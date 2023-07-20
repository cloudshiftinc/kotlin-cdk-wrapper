@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnSolution

@CdkDslMarker
public class CfnSolutionAlgorithmHyperParameterRangesPropertyDsl {
  private val cdkBuilder: CfnSolution.AlgorithmHyperParameterRangesProperty.Builder =
      CfnSolution.AlgorithmHyperParameterRangesProperty.builder()

  private val _categoricalHyperParameterRanges: MutableList<Any> = mutableListOf()

  private val _continuousHyperParameterRanges: MutableList<Any> = mutableListOf()

  private val _integerHyperParameterRanges: MutableList<Any> = mutableListOf()

  public fun categoricalHyperParameterRanges(vararg categoricalHyperParameterRanges: Any) {
    _categoricalHyperParameterRanges.addAll(listOf(*categoricalHyperParameterRanges))
  }

  public fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: Collection<Any>) {
    _categoricalHyperParameterRanges.addAll(categoricalHyperParameterRanges)
  }

  public fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: IResolvable) {
    cdkBuilder.categoricalHyperParameterRanges(categoricalHyperParameterRanges)
  }

  public fun continuousHyperParameterRanges(vararg continuousHyperParameterRanges: Any) {
    _continuousHyperParameterRanges.addAll(listOf(*continuousHyperParameterRanges))
  }

  public fun continuousHyperParameterRanges(continuousHyperParameterRanges: Collection<Any>) {
    _continuousHyperParameterRanges.addAll(continuousHyperParameterRanges)
  }

  public fun continuousHyperParameterRanges(continuousHyperParameterRanges: IResolvable) {
    cdkBuilder.continuousHyperParameterRanges(continuousHyperParameterRanges)
  }

  public fun integerHyperParameterRanges(vararg integerHyperParameterRanges: Any) {
    _integerHyperParameterRanges.addAll(listOf(*integerHyperParameterRanges))
  }

  public fun integerHyperParameterRanges(integerHyperParameterRanges: Collection<Any>) {
    _integerHyperParameterRanges.addAll(integerHyperParameterRanges)
  }

  public fun integerHyperParameterRanges(integerHyperParameterRanges: IResolvable) {
    cdkBuilder.integerHyperParameterRanges(integerHyperParameterRanges)
  }

  public fun build(): CfnSolution.AlgorithmHyperParameterRangesProperty {
    if(_categoricalHyperParameterRanges.isNotEmpty())
        cdkBuilder.categoricalHyperParameterRanges(_categoricalHyperParameterRanges)
    if(_continuousHyperParameterRanges.isNotEmpty())
        cdkBuilder.continuousHyperParameterRanges(_continuousHyperParameterRanges)
    if(_integerHyperParameterRanges.isNotEmpty())
        cdkBuilder.integerHyperParameterRanges(_integerHyperParameterRanges)
    return cdkBuilder.build()
  }
}
