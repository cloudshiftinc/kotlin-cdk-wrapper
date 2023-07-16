@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Stack
import software.amazon.awscdk.pipelines.StackSteps
import software.amazon.awscdk.pipelines.Step

@CdkDslMarker
public class StackStepsDsl {
  private val cdkBuilder: StackSteps.Builder = StackSteps.builder()

  private val _changeSet: MutableList<Step> = mutableListOf()

  private val _post: MutableList<Step> = mutableListOf()

  private val _pre: MutableList<Step> = mutableListOf()

  public fun changeSet(vararg changeSet: Step) {
    _changeSet.addAll(listOf(*changeSet))
  }

  public fun changeSet(changeSet: Collection<Step>) {
    _changeSet.addAll(changeSet)
  }

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

  public fun stack(stack: Stack) {
    cdkBuilder.stack(stack)
  }

  public fun build(): StackSteps {
    if(_changeSet.isNotEmpty()) cdkBuilder.changeSet(_changeSet)
    if(_post.isNotEmpty()) cdkBuilder.post(_post)
    if(_pre.isNotEmpty()) cdkBuilder.pre(_pre)
    return cdkBuilder.build()
  }
}
