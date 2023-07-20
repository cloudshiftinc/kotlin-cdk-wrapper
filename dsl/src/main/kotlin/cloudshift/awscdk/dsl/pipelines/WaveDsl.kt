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

  public fun post(vararg post: Step) {
    _post.addAll(listOf(*post))
  }

  public fun post(post: Collection<Step>) {
    _post.addAll(post)
  }

  public fun pre(vararg pre: Step) {
    _pre.addAll(listOf(*pre))
  }

  public fun pre(pre: Collection<Step>) {
    _pre.addAll(pre)
  }

  public fun build(): Wave {
    if(_post.isNotEmpty()) cdkBuilder.post(_post)
    if(_pre.isNotEmpty()) cdkBuilder.pre(_pre)
    return cdkBuilder.build()
  }
}
