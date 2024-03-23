@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Defines an action for an extension.
 *
 * Example:
 *
 * ```
 * Function fn;
 * Extension.Builder.create(this, "MyExtension")
 * .actions(List.of(
 * Action.Builder.create()
 * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
 * .eventDestination(new LambdaDestination(fn))
 * .build()))
 * .build();
 * ```
 */
public open class Action(
  cdkObject: software.amazon.awscdk.services.appconfig.Action,
) : CdkObject(cdkObject) {
  public constructor(props: ActionProps) :
      this(software.amazon.awscdk.services.appconfig.Action(props.let(ActionProps::unwrap))
  )

  public constructor(props: ActionProps.Builder.() -> Unit) : this(ActionProps(props)
  )

  /**
   * The action points that will trigger the extension action.
   */
  public open fun actionPoints(): List<ActionPoint> =
      unwrap(this).getActionPoints().map(ActionPoint::wrap)

  /**
   * The description for the action.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The event destination for the action.
   */
  public open fun eventDestination(): IEventDestination =
      unwrap(this).getEventDestination().let(IEventDestination::wrap)

  /**
   * The execution role for the action.
   */
  public open fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  /**
   * The flag that specifies whether to create the execution role.
   */
  public open fun invokeWithoutExecutionRole(): Boolean? =
      unwrap(this).getInvokeWithoutExecutionRole()

  /**
   * The name for the action.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.Action].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The action points that will trigger the extension action.
     *
     * @param actionPoints The action points that will trigger the extension action. 
     */
    public fun actionPoints(actionPoints: List<ActionPoint>)

    /**
     * The action points that will trigger the extension action.
     *
     * @param actionPoints The action points that will trigger the extension action. 
     */
    public fun actionPoints(vararg actionPoints: ActionPoint)

    /**
     * The description for the action.
     *
     * Default: - No description.
     *
     * @param description The description for the action. 
     */
    public fun description(description: String)

    /**
     * The event destination for the action.
     *
     * @param eventDestination The event destination for the action. 
     */
    public fun eventDestination(eventDestination: IEventDestination)

    /**
     * The execution role for the action.
     *
     * Default: - A role is generated.
     *
     * @param executionRole The execution role for the action. 
     */
    public fun executionRole(executionRole: IRole)

    /**
     * The flag that specifies whether or not to create the execution role.
     *
     * If set to true, then the role will not be auto-generated under the assumption
     * there is already the corresponding resource-based policy attached to the event
     * destination. If false, the execution role will be generated if not provided.
     *
     * Default: false
     *
     * @param invokeWithoutExecutionRole The flag that specifies whether or not to create the
     * execution role. 
     */
    public fun invokeWithoutExecutionRole(invokeWithoutExecutionRole: Boolean)

    /**
     * The name for the action.
     *
     * Default: - A name is generated.
     *
     * @param name The name for the action. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.Action.Builder =
        software.amazon.awscdk.services.appconfig.Action.Builder.create()

    /**
     * The action points that will trigger the extension action.
     *
     * @param actionPoints The action points that will trigger the extension action. 
     */
    override fun actionPoints(actionPoints: List<ActionPoint>) {
      cdkBuilder.actionPoints(actionPoints.map(ActionPoint::unwrap))
    }

    /**
     * The action points that will trigger the extension action.
     *
     * @param actionPoints The action points that will trigger the extension action. 
     */
    override fun actionPoints(vararg actionPoints: ActionPoint): Unit =
        actionPoints(actionPoints.toList())

    /**
     * The description for the action.
     *
     * Default: - No description.
     *
     * @param description The description for the action. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The event destination for the action.
     *
     * @param eventDestination The event destination for the action. 
     */
    override fun eventDestination(eventDestination: IEventDestination) {
      cdkBuilder.eventDestination(eventDestination.let(IEventDestination::unwrap))
    }

    /**
     * The execution role for the action.
     *
     * Default: - A role is generated.
     *
     * @param executionRole The execution role for the action. 
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    /**
     * The flag that specifies whether or not to create the execution role.
     *
     * If set to true, then the role will not be auto-generated under the assumption
     * there is already the corresponding resource-based policy attached to the event
     * destination. If false, the execution role will be generated if not provided.
     *
     * Default: false
     *
     * @param invokeWithoutExecutionRole The flag that specifies whether or not to create the
     * execution role. 
     */
    override fun invokeWithoutExecutionRole(invokeWithoutExecutionRole: Boolean) {
      cdkBuilder.invokeWithoutExecutionRole(invokeWithoutExecutionRole)
    }

    /**
     * The name for the action.
     *
     * Default: - A name is generated.
     *
     * @param name The name for the action. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.Action = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Action {
      val builderImpl = BuilderImpl()
      return Action(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Action): Action =
        Action(cdkObject)

    internal fun unwrap(wrapped: Action): software.amazon.awscdk.services.appconfig.Action =
        wrapped.cdkObject as software.amazon.awscdk.services.appconfig.Action
  }
}
