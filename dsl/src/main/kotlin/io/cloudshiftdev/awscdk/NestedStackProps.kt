package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface NestedStackProps {
  /**
   * A description of the stack.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Simple Notification Service (SNS) topics to publish stack related events.
   *
   * Default: - notifications are not sent for this stack.
   */
  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

  /**
   * The set value pairs that represent the parameters passed to CloudFormation when this nested
   * stack is created.
   *
   * Each parameter has a name corresponding
   * to a parameter defined in the embedded template and a value representing
   * the value that you want to set for the parameter.
   *
   * The nested stack construct will automatically synthesize parameters in order
   * to bind references from the parent stack(s) into the nested stack.
   *
   * Default: - no user-defined parameters are passed to the nested stack
   */
  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * Policy to apply when the nested stack is removed.
   *
   * The default is `Destroy`, because all Removal Policies of resources inside the
   * Nested Stack should already have been set correctly. You normally should
   * not need to set this value.
   *
   * Default: RemovalPolicy.DESTROY
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The length of time that CloudFormation waits for the nested stack to reach the CREATE_COMPLETE
   * state.
   *
   * When CloudFormation detects that the nested stack has reached the
   * CREATE_COMPLETE state, it marks the nested stack resource as
   * CREATE_COMPLETE in the parent stack and resumes creating the parent stack.
   * If the timeout period expires before the nested stack reaches
   * CREATE_COMPLETE, CloudFormation marks the nested stack as failed and rolls
   * back both the nested stack and parent stack.
   *
   * Default: - no timeout
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * A builder for [NestedStackProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the stack.
     */
    public fun description(description: String)

    /**
     * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
     * events.
     */
    public fun notificationArns(notificationArns: List<String>)

    /**
     * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
     * events.
     */
    public fun notificationArns(vararg notificationArns: String)

    /**
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created.
     * Each parameter has a name corresponding
     * to a parameter defined in the embedded template and a value representing
     * the value that you want to set for the parameter.
     *
     * The nested stack construct will automatically synthesize parameters in order
     * to bind references from the parent stack(s) into the nested stack.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param removalPolicy Policy to apply when the nested stack is removed.
     * The default is `Destroy`, because all Removal Policies of resources inside the
     * Nested Stack should already have been set correctly. You normally should
     * not need to set this value.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param timeout The length of time that CloudFormation waits for the nested stack to reach the
     * CREATE_COMPLETE state.
     * When CloudFormation detects that the nested stack has reached the
     * CREATE_COMPLETE state, it marks the nested stack resource as
     * CREATE_COMPLETE in the parent stack and resumes creating the parent stack.
     * If the timeout period expires before the nested stack reaches
     * CREATE_COMPLETE, CloudFormation marks the nested stack as failed and rolls
     * back both the nested stack and parent stack.
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.NestedStackProps.Builder =
        software.amazon.awscdk.NestedStackProps.builder()

    /**
     * @param description A description of the stack.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
     * events.
     */
    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    /**
     * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
     * events.
     */
    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    /**
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created.
     * Each parameter has a name corresponding
     * to a parameter defined in the embedded template and a value representing
     * the value that you want to set for the parameter.
     *
     * The nested stack construct will automatically synthesize parameters in order
     * to bind references from the parent stack(s) into the nested stack.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param removalPolicy Policy to apply when the nested stack is removed.
     * The default is `Destroy`, because all Removal Policies of resources inside the
     * Nested Stack should already have been set correctly. You normally should
     * not need to set this value.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param timeout The length of time that CloudFormation waits for the nested stack to reach the
     * CREATE_COMPLETE state.
     * When CloudFormation detects that the nested stack has reached the
     * CREATE_COMPLETE state, it marks the nested stack resource as
     * CREATE_COMPLETE in the parent stack and resumes creating the parent stack.
     * If the timeout period expires before the nested stack reaches
     * CREATE_COMPLETE, CloudFormation marks the nested stack as failed and rolls
     * back both the nested stack and parent stack.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.NestedStackProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.NestedStackProps,
  ) : CdkObject(cdkObject), NestedStackProps {
    /**
     * A description of the stack.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Simple Notification Service (SNS) topics to publish stack related events.
     *
     * Default: - notifications are not sent for this stack.
     */
    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    /**
     * The set value pairs that represent the parameters passed to CloudFormation when this nested
     * stack is created.
     *
     * Each parameter has a name corresponding
     * to a parameter defined in the embedded template and a value representing
     * the value that you want to set for the parameter.
     *
     * The nested stack construct will automatically synthesize parameters in order
     * to bind references from the parent stack(s) into the nested stack.
     *
     * Default: - no user-defined parameters are passed to the nested stack
     */
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * Policy to apply when the nested stack is removed.
     *
     * The default is `Destroy`, because all Removal Policies of resources inside the
     * Nested Stack should already have been set correctly. You normally should
     * not need to set this value.
     *
     * Default: RemovalPolicy.DESTROY
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The length of time that CloudFormation waits for the nested stack to reach the
     * CREATE_COMPLETE state.
     *
     * When CloudFormation detects that the nested stack has reached the
     * CREATE_COMPLETE state, it marks the nested stack resource as
     * CREATE_COMPLETE in the parent stack and resumes creating the parent stack.
     * If the timeout period expires before the nested stack reaches
     * CREATE_COMPLETE, CloudFormation marks the nested stack as failed and rolls
     * back both the nested stack and parent stack.
     *
     * Default: - no timeout
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NestedStackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.NestedStackProps): NestedStackProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NestedStackProps): software.amazon.awscdk.NestedStackProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.NestedStackProps
  }
}
