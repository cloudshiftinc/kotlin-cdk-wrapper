@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.Step
import software.amazon.awscdk.pipelines.Wave

@CdkDslMarker
public class WaveDsl(
  id: String,
) {
  private val cdkBuilder: Wave.Builder = Wave.Builder.create(id)

  private val _post: MutableList<Step> = mutableListOf()

  private val _pre: MutableList<Step> = mutableListOf()

  /**
   * Additional steps to run after all of the stages in the wave.
   *
   * Default: - No additional steps
   *
   * @param post Additional steps to run after all of the stages in the wave. 
   */
  public fun post(vararg post: Step) {
    _post.addAll(listOf(*post))
  }

  /**
   * Additional steps to run after all of the stages in the wave.
   *
   * Default: - No additional steps
   *
   * @param post Additional steps to run after all of the stages in the wave. 
   */
  public fun post(post: Collection<Step>) {
    _post.addAll(post)
  }

  /**
   * Additional steps to run before any of the stages in the wave.
   *
   * Default: - No additional steps
   *
   * @param pre Additional steps to run before any of the stages in the wave. 
   */
  public fun pre(vararg pre: Step) {
    _pre.addAll(listOf(*pre))
  }

  /**
   * Additional steps to run before any of the stages in the wave.
   *
   * Default: - No additional steps
   *
   * @param pre Additional steps to run before any of the stages in the wave. 
   */
  public fun pre(pre: Collection<Step>) {
    _pre.addAll(pre)
  }

  public fun build(): Wave {
    if(_post.isNotEmpty()) cdkBuilder.post(_post)
    if(_pre.isNotEmpty()) cdkBuilder.pre(_pre)
    return cdkBuilder.build()
  }
}
