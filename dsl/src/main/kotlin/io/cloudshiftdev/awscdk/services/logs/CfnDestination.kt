package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDestination internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.CfnDestination,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun destinationName(): String = unwrap(this).getDestinationName()

  public open fun destinationName(`value`: String) {
    unwrap(this).setDestinationName(`value`)
  }

  public open fun destinationPolicy(): String? = unwrap(this).getDestinationPolicy()

  public open fun destinationPolicy(`value`: String) {
    unwrap(this).setDestinationPolicy(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun targetArn(): String = unwrap(this).getTargetArn()

  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  public interface Builder {
    public fun destinationName(destinationName: String) {
    }

    public fun destinationPolicy(destinationPolicy: String) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun targetArn(targetArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDestination.Builder =
        software.amazon.awscdk.services.logs.CfnDestination.Builder.create(scope, id)

    public override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    public override fun destinationPolicy(destinationPolicy: String) {
      cdkBuilder.destinationPolicy(destinationPolicy)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnDestination = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDestination):
        CfnDestination = CfnDestination(cdkObject)

    internal fun unwrap(wrapped: CfnDestination):
        software.amazon.awscdk.services.logs.CfnDestination = wrapped.cdkObject
  }
}
