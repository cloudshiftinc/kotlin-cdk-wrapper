package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPolicyTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrPolicyTemplateId(): String = unwrap(this).getAttrPolicyTemplateId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyStoreId(): String = unwrap(this).getPolicyStoreId()

  public open fun policyStoreId(`value`: String) {
    unwrap(this).setPolicyStoreId(`value`)
  }

  public open fun statement(): String = unwrap(this).getStatement()

  public open fun statement(`value`: String) {
    unwrap(this).setStatement(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun policyStoreId(policyStoreId: String) {
    }

    public fun statement(statement: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate.Builder.create(scope,
        id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    public override fun statement(statement: String) {
      cdkBuilder.statement(statement)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicyTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicyTemplate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate):
        CfnPolicyTemplate = CfnPolicyTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyTemplate):
        software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate = wrapped.cdkObject
  }
}
