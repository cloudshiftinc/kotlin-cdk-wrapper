@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface NestedStackProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun notificationArns(notificationArns: List<String>)

    public fun notificationArns(vararg notificationArns: String)

    public fun parameters(parameters: Map<String, String>)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.NestedStackProps.Builder =
        software.amazon.awscdk.NestedStackProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.NestedStackProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.NestedStackProps,
  ) : CdkObject(cdkObject), NestedStackProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

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
