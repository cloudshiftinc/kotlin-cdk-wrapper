package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStateMachineVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun stateMachineArn(): String = unwrap(this).getStateMachineArn()

  public open fun stateMachineArn(`value`: String) {
    unwrap(this).setStateMachineArn(`value`)
  }

  public open fun stateMachineRevisionId(): String? = unwrap(this).getStateMachineRevisionId()

  public open fun stateMachineRevisionId(`value`: String) {
    unwrap(this).setStateMachineRevisionId(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun stateMachineArn(stateMachineArn: String) {
    }

    public fun stateMachineRevisionId(stateMachineRevisionId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion.Builder.create(scope,
        id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun stateMachineArn(stateMachineArn: String) {
      cdkBuilder.stateMachineArn(stateMachineArn)
    }

    public override fun stateMachineRevisionId(stateMachineRevisionId: String) {
      cdkBuilder.stateMachineRevisionId(stateMachineRevisionId)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStateMachineVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStateMachineVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion):
        CfnStateMachineVersion = CfnStateMachineVersion(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineVersion):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion = wrapped.cdkObject
  }
}
