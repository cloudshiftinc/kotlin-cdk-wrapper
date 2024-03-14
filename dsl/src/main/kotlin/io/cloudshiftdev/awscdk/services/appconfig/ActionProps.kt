package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ActionProps {
  /**
   * The action points that will trigger the extension action.
   */
  public fun actionPoints(): List<ActionPoint>

  /**
   * The description for the action.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The event destination for the action.
   */
  public fun eventDestination(): IEventDestination

  /**
   * The execution role for the action.
   *
   * Default: - A role is generated.
   */
  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  /**
   * The flag that specifies whether or not to create the execution role.
   *
   * If set to true, then the role will not be auto-generated under the assumption
   * there is already the corresponding resource-based policy attached to the event
   * destination. If false, the execution role will be generated if not provided.
   *
   * Default: false
   */
  public fun invokeWithoutExecutionRole(): Boolean? = unwrap(this).getInvokeWithoutExecutionRole()

  /**
   * The name for the action.
   *
   * Default: - A name is generated.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [ActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionPoints The action points that will trigger the extension action. 
     */
    public fun actionPoints(actionPoints: List<ActionPoint>)

    /**
     * @param actionPoints The action points that will trigger the extension action. 
     */
    public fun actionPoints(vararg actionPoints: ActionPoint)

    /**
     * @param description The description for the action.
     */
    public fun description(description: String)

    /**
     * @param eventDestination The event destination for the action. 
     */
    public fun eventDestination(eventDestination: IEventDestination)

    /**
     * @param executionRole The execution role for the action.
     */
    public fun executionRole(executionRole: IRole)

    /**
     * @param invokeWithoutExecutionRole The flag that specifies whether or not to create the
     * execution role.
     * If set to true, then the role will not be auto-generated under the assumption
     * there is already the corresponding resource-based policy attached to the event
     * destination. If false, the execution role will be generated if not provided.
     */
    public fun invokeWithoutExecutionRole(invokeWithoutExecutionRole: Boolean)

    /**
     * @param name The name for the action.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ActionProps.Builder =
        software.amazon.awscdk.services.appconfig.ActionProps.builder()

    /**
     * @param actionPoints The action points that will trigger the extension action. 
     */
    override fun actionPoints(actionPoints: List<ActionPoint>) {
      cdkBuilder.actionPoints(actionPoints.map(ActionPoint::unwrap))
    }

    /**
     * @param actionPoints The action points that will trigger the extension action. 
     */
    override fun actionPoints(vararg actionPoints: ActionPoint): Unit =
        actionPoints(actionPoints.toList())

    /**
     * @param description The description for the action.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventDestination The event destination for the action. 
     */
    override fun eventDestination(eventDestination: IEventDestination) {
      cdkBuilder.eventDestination(eventDestination.let(IEventDestination::unwrap))
    }

    /**
     * @param executionRole The execution role for the action.
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    /**
     * @param invokeWithoutExecutionRole The flag that specifies whether or not to create the
     * execution role.
     * If set to true, then the role will not be auto-generated under the assumption
     * there is already the corresponding resource-based policy attached to the event
     * destination. If false, the execution role will be generated if not provided.
     */
    override fun invokeWithoutExecutionRole(invokeWithoutExecutionRole: Boolean) {
      cdkBuilder.invokeWithoutExecutionRole(invokeWithoutExecutionRole)
    }

    /**
     * @param name The name for the action.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.ActionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.ActionProps,
  ) : CdkObject(cdkObject), ActionProps {
    /**
     * The action points that will trigger the extension action.
     */
    override fun actionPoints(): List<ActionPoint> =
        unwrap(this).getActionPoints().map(ActionPoint::wrap)

    /**
     * The description for the action.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The event destination for the action.
     */
    override fun eventDestination(): IEventDestination =
        unwrap(this).getEventDestination().let(IEventDestination::wrap)

    /**
     * The execution role for the action.
     *
     * Default: - A role is generated.
     */
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    /**
     * The flag that specifies whether or not to create the execution role.
     *
     * If set to true, then the role will not be auto-generated under the assumption
     * there is already the corresponding resource-based policy attached to the event
     * destination. If false, the execution role will be generated if not provided.
     *
     * Default: false
     */
    override fun invokeWithoutExecutionRole(): Boolean? =
        unwrap(this).getInvokeWithoutExecutionRole()

    /**
     * The name for the action.
     *
     * Default: - A name is generated.
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ActionProps): ActionProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionProps): software.amazon.awscdk.services.appconfig.ActionProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.ActionProps
  }
}
