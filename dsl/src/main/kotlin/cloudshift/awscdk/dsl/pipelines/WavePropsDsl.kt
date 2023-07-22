@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.Step
import software.amazon.awscdk.pipelines.WaveProps

/**
 * Construction properties for a `Wave`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.pipelines.*;
 * Step step;
 * WaveProps waveProps = WaveProps.builder()
 * .post(List.of(step))
 * .pre(List.of(step))
 * .build();
 * ```
 */
@CdkDslMarker
public class WavePropsDsl {
  private val cdkBuilder: WaveProps.Builder = WaveProps.builder()

  private val _post: MutableList<Step> = mutableListOf()

  private val _pre: MutableList<Step> = mutableListOf()

  /**
   * @param post Additional steps to run after all of the stages in the wave.
   */
  public fun post(vararg post: Step) {
    _post.addAll(listOf(*post))
  }

  /**
   * @param post Additional steps to run after all of the stages in the wave.
   */
  public fun post(post: Collection<Step>) {
    _post.addAll(post)
  }

  /**
   * @param pre Additional steps to run before any of the stages in the wave.
   */
  public fun pre(vararg pre: Step) {
    _pre.addAll(listOf(*pre))
  }

  /**
   * @param pre Additional steps to run before any of the stages in the wave.
   */
  public fun pre(pre: Collection<Step>) {
    _pre.addAll(pre)
  }

  public fun build(): WaveProps {
    if(_post.isNotEmpty()) cdkBuilder.post(_post)
    if(_pre.isNotEmpty()) cdkBuilder.pre(_pre)
    return cdkBuilder.build()
  }
}
