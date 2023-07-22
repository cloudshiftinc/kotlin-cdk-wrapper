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

  /**
   * @param changeSet Steps that execute after stack is prepared but before stack is deployed.
   */
  public fun changeSet(vararg changeSet: Step) {
    _changeSet.addAll(listOf(*changeSet))
  }

  /**
   * @param changeSet Steps that execute after stack is prepared but before stack is deployed.
   */
  public fun changeSet(changeSet: Collection<Step>) {
    _changeSet.addAll(changeSet)
  }

  /**
   * @param post Steps that execute after stack is deployed.
   */
  public fun post(vararg post: Step) {
    _post.addAll(listOf(*post))
  }

  /**
   * @param post Steps that execute after stack is deployed.
   */
  public fun post(post: Collection<Step>) {
    _post.addAll(post)
  }

  /**
   * @param pre Steps that execute before stack is prepared.
   */
  public fun pre(vararg pre: Step) {
    _pre.addAll(listOf(*pre))
  }

  /**
   * @param pre Steps that execute before stack is prepared.
   */
  public fun pre(pre: Collection<Step>) {
    _pre.addAll(pre)
  }

  /**
   * @param stack The stack you want the steps to run in. 
   */
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
