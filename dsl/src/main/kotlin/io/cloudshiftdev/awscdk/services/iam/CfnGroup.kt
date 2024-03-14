package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnGroup,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun groupName(): String? = unwrap(this).getGroupName()

  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
      emptyList()

  public open fun managedPolicyArns(`value`: List<String>) {
    unwrap(this).setManagedPolicyArns(`value`)
  }

  public open fun path(): String? = unwrap(this).getPath()

  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  public open fun policies(): Any? = unwrap(this).getPolicies()

  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun policies(__idx_ac66f0: List<Any>) {
    unwrap(this).setPolicies(__idx_ac66f0)
  }

  public interface Builder {
    public fun groupName(groupName: String)

    public fun managedPolicyArns(managedPolicyArns: List<String>)

    public fun path(path: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnGroup.Builder =
        software.amazon.awscdk.services.iam.CfnGroup.Builder.create(scope, id)

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnGroup): CfnGroup =
        CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.iam.CfnGroup =
        wrapped.cdkObject
  }

  public interface PolicyProperty {
    public fun policyDocument(): Any

    public fun policyName(): String

    public interface Builder {
      public fun policyDocument(policyDocument: Any)

      public fun policyName(policyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty.Builder =
          software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty.builder()

      override fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
      }

      override fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
      }

      public fun build(): software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty,
    ) : PolicyProperty {
      override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

      override fun policyName(): String = unwrap(this).getPolicyName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty):
          PolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyProperty):
          software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
