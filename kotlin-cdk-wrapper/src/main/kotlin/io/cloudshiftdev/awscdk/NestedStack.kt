@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NestedStack internal constructor(
  internal override val cdkObject: software.amazon.awscdk.NestedStack,
) : Stack(cdkObject) {
  public override fun nestedStackResource(): CfnResource? =
      unwrap(this).getNestedStackResource()?.let(CfnResource::wrap)

  public open fun parameter(name: String, `value`: String) {
    unwrap(this).setParameter(name, `value`)
  }

  public override fun stackId(): String = unwrap(this).getStackId()

  public override fun stackName(): String = unwrap(this).getStackName()

  public override fun templateFile(): String = unwrap(this).getTemplateFile()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun notificationArns(notificationArns: List<String>)

    public fun notificationArns(vararg notificationArns: String)

    public fun parameters(parameters: Map<String, String>)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.NestedStack.Builder =
        software.amazon.awscdk.NestedStack.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.NestedStack = cdkBuilder.build()
  }

  public companion object {
    public fun isNestedStack(x: Any): Boolean = software.amazon.awscdk.NestedStack.isNestedStack(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NestedStack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NestedStack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.NestedStack): NestedStack =
        NestedStack(cdkObject)

    internal fun unwrap(wrapped: NestedStack): software.amazon.awscdk.NestedStack =
        wrapped.cdkObject
  }
}
