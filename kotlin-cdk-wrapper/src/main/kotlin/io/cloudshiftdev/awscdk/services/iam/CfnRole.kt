@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRole internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CfnRole,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun assumeRolePolicyDocument(): Any = unwrap(this).getAssumeRolePolicyDocument()

  public open fun assumeRolePolicyDocument(`value`: Any) {
    unwrap(this).setAssumeRolePolicyDocument(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrRoleId(): String = unwrap(this).getAttrRoleId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
      emptyList()

  public open fun managedPolicyArns(`value`: List<String>) {
    unwrap(this).setManagedPolicyArns(`value`)
  }

  public open fun managedPolicyArns(vararg `value`: String): Unit =
      managedPolicyArns(`value`.toList())

  public open fun maxSessionDuration(): Number? = unwrap(this).getMaxSessionDuration()

  public open fun maxSessionDuration(`value`: Number) {
    unwrap(this).setMaxSessionDuration(`value`)
  }

  public open fun path(): String? = unwrap(this).getPath()

  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  public open fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

  public open fun permissionsBoundary(`value`: String) {
    unwrap(this).setPermissionsBoundary(`value`)
  }

  public open fun policies(): Any? = unwrap(this).getPolicies()

  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun policies(__idx_ac66f0: List<Any>) {
    unwrap(this).setPolicies(__idx_ac66f0)
  }

  public open fun policies(vararg __idx_ac66f0: Any): Unit = policies(__idx_ac66f0.toList())

  public open fun roleName(): String? = unwrap(this).getRoleName()

  public open fun roleName(`value`: String) {
    unwrap(this).setRoleName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any)

    public fun description(description: String)

    public fun managedPolicyArns(managedPolicyArns: List<String>)

    public fun managedPolicyArns(vararg managedPolicyArns: String)

    public fun maxSessionDuration(maxSessionDuration: Number)

    public fun path(path: String)

    public fun permissionsBoundary(permissionsBoundary: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: List<Any>)

    public fun policies(vararg policies: Any)

    public fun roleName(roleName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnRole.Builder =
        software.amazon.awscdk.services.iam.CfnRole.Builder.create(scope, id)

    override fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
      cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

    override fun maxSessionDuration(maxSessionDuration: Number) {
      cdkBuilder.maxSessionDuration(maxSessionDuration)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun permissionsBoundary(permissionsBoundary: String) {
      cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnRole = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnRole.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRole {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRole(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnRole): CfnRole =
        CfnRole(cdkObject)

    internal fun unwrap(wrapped: CfnRole): software.amazon.awscdk.services.iam.CfnRole =
        wrapped.cdkObject
  }

  public interface PolicyProperty {
    public fun policyDocument(): Any

    public fun policyName(): String

    @CdkDslMarker
    public interface Builder {
      public fun policyDocument(policyDocument: Any)

      public fun policyName(policyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.iam.CfnRole.PolicyProperty.Builder =
          software.amazon.awscdk.services.iam.CfnRole.PolicyProperty.builder()

      override fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
      }

      override fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
      }

      public fun build(): software.amazon.awscdk.services.iam.CfnRole.PolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iam.CfnRole.PolicyProperty,
    ) : CdkObject(cdkObject), PolicyProperty {
      override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

      override fun policyName(): String = unwrap(this).getPolicyName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnRole.PolicyProperty):
          PolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyProperty):
          software.amazon.awscdk.services.iam.CfnRole.PolicyProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnRole.PolicyProperty
    }
  }
}
