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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUser internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CfnUser,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  public open fun groups(`value`: List<String>) {
    unwrap(this).setGroups(`value`)
  }

  public open fun groups(vararg `value`: String): Unit = groups(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loginProfile(): Any? = unwrap(this).getLoginProfile()

  public open fun loginProfile(`value`: IResolvable) {
    unwrap(this).setLoginProfile(`value`.let(IResolvable::unwrap))
  }

  public open fun loginProfile(`value`: LoginProfileProperty) {
    unwrap(this).setLoginProfile(`value`.let(LoginProfileProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d872147e167dfec255d786f88a067073906fa68b3bf09787f6d54f57e962c0f")
  public open fun loginProfile(`value`: LoginProfileProperty.Builder.() -> Unit): Unit =
      loginProfile(LoginProfileProperty(`value`))

  public open fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
      emptyList()

  public open fun managedPolicyArns(`value`: List<String>) {
    unwrap(this).setManagedPolicyArns(`value`)
  }

  public open fun managedPolicyArns(vararg `value`: String): Unit =
      managedPolicyArns(`value`.toList())

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

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun userName(): String? = unwrap(this).getUserName()

  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun groups(groups: List<String>)

    public fun groups(vararg groups: String)

    public fun loginProfile(loginProfile: IResolvable)

    public fun loginProfile(loginProfile: LoginProfileProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e416b96c582056f728935e6aefb15f393a8ba15e7b3efc35a0017decd484631")
    public fun loginProfile(loginProfile: LoginProfileProperty.Builder.() -> Unit)

    public fun managedPolicyArns(managedPolicyArns: List<String>)

    public fun managedPolicyArns(vararg managedPolicyArns: String)

    public fun path(path: String)

    public fun permissionsBoundary(permissionsBoundary: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: List<Any>)

    public fun policies(vararg policies: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUser.Builder =
        software.amazon.awscdk.services.iam.CfnUser.Builder.create(scope, id)

    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    override fun loginProfile(loginProfile: IResolvable) {
      cdkBuilder.loginProfile(loginProfile.let(IResolvable::unwrap))
    }

    override fun loginProfile(loginProfile: LoginProfileProperty) {
      cdkBuilder.loginProfile(loginProfile.let(LoginProfileProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e416b96c582056f728935e6aefb15f393a8ba15e7b3efc35a0017decd484631")
    override fun loginProfile(loginProfile: LoginProfileProperty.Builder.() -> Unit): Unit =
        loginProfile(LoginProfileProperty(loginProfile))

    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

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

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnUser = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnUser.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.iam.CfnUser =
        wrapped.cdkObject
  }

  public interface LoginProfileProperty {
    public fun password(): String

    public fun passwordResetRequired(): Any? = unwrap(this).getPasswordResetRequired()

    @CdkDslMarker
    public interface Builder {
      public fun password(password: String)

      public fun passwordResetRequired(passwordResetRequired: Boolean)

      public fun passwordResetRequired(passwordResetRequired: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty.Builder =
          software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty.builder()

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun passwordResetRequired(passwordResetRequired: Boolean) {
        cdkBuilder.passwordResetRequired(passwordResetRequired)
      }

      override fun passwordResetRequired(passwordResetRequired: IResolvable) {
        cdkBuilder.passwordResetRequired(passwordResetRequired.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty,
    ) : CdkObject(cdkObject), LoginProfileProperty {
      override fun password(): String = unwrap(this).getPassword()

      override fun passwordResetRequired(): Any? = unwrap(this).getPasswordResetRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoginProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty):
          LoginProfileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoginProfileProperty):
          software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty
    }
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
      private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUser.PolicyProperty.Builder =
          software.amazon.awscdk.services.iam.CfnUser.PolicyProperty.builder()

      override fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
      }

      override fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
      }

      public fun build(): software.amazon.awscdk.services.iam.CfnUser.PolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iam.CfnUser.PolicyProperty,
    ) : CdkObject(cdkObject), PolicyProperty {
      override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

      override fun policyName(): String = unwrap(this).getPolicyName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUser.PolicyProperty):
          PolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyProperty):
          software.amazon.awscdk.services.iam.CfnUser.PolicyProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnUser.PolicyProperty
    }
  }
}
