package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUser internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnUser,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  public open fun groups(`value`: List<String>) {
    unwrap(this).setGroups(`value`)
  }

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

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d872147e167dfec255d786f88a067073906fa68b3bf09787f6d54f57e962c0f")
  public open fun loginProfile(`value`: LoginProfileProperty.Builder.() -> Unit): Unit =
      loginProfile(LoginProfileProperty(`value`))

  public open fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
      emptyList()

  public open fun managedPolicyArns(`value`: List<String>) {
    unwrap(this).setManagedPolicyArns(`value`)
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

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun userName(): String? = unwrap(this).getUserName()

  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  public interface Builder {
    public fun groups(groups: List<String>) {
    }

    public fun loginProfile(loginProfile: IResolvable) {
    }

    public fun loginProfile(loginProfile: LoginProfileProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e416b96c582056f728935e6aefb15f393a8ba15e7b3efc35a0017decd484631")
    public fun loginProfile(loginProfile: LoginProfileProperty.Builder.() -> Unit) {
    }

    public fun managedPolicyArns(managedPolicyArns: List<String>) {
    }

    public fun path(path: String) {
    }

    public fun permissionsBoundary(permissionsBoundary: String) {
    }

    public fun policies(policies: IResolvable) {
    }

    public fun policies(policies: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun userName(userName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUser.Builder =
        software.amazon.awscdk.services.iam.CfnUser.Builder.create(scope, id)

    public override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    public override fun loginProfile(loginProfile: IResolvable) {
      cdkBuilder.loginProfile(loginProfile.let(IResolvable::unwrap))
    }

    public override fun loginProfile(loginProfile: LoginProfileProperty) {
      cdkBuilder.loginProfile(loginProfile.let(LoginProfileProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e416b96c582056f728935e6aefb15f393a8ba15e7b3efc35a0017decd484631")
    public override fun loginProfile(loginProfile: LoginProfileProperty.Builder.() -> Unit): Unit =
        loginProfile(LoginProfileProperty(loginProfile))

    public override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    public override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public override fun permissionsBoundary(permissionsBoundary: String) {
      cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    public override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    public override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnUser = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun password(password: String) {
      }

      public fun passwordResetRequired(passwordResetRequired: Boolean) {
      }

      public fun passwordResetRequired(passwordResetRequired: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty.Builder =
          software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty.builder()

      public override fun password(password: String) {
        cdkBuilder.password(password)
      }

      public override fun passwordResetRequired(passwordResetRequired: Boolean) {
        cdkBuilder.passwordResetRequired(passwordResetRequired)
      }

      public override fun passwordResetRequired(passwordResetRequired: IResolvable) {
        cdkBuilder.passwordResetRequired(passwordResetRequired.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty,
    ) : LoginProfileProperty {
      public override fun password(): String = unwrap(this).getPassword()

      public override fun passwordResetRequired(): Any? = unwrap(this).getPasswordResetRequired()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoginProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty):
          LoginProfileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoginProfileProperty):
          software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PolicyProperty {
    public fun policyDocument(): Any

    public fun policyName(): String

    public interface Builder {
      public fun policyDocument(policyDocument: Any) {
      }

      public fun policyName(policyName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUser.PolicyProperty.Builder =
          software.amazon.awscdk.services.iam.CfnUser.PolicyProperty.builder()

      public override fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
      }

      public override fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
      }

      public fun build(): software.amazon.awscdk.services.iam.CfnUser.PolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iam.CfnUser.PolicyProperty,
    ) : PolicyProperty {
      public override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

      public override fun policyName(): String = unwrap(this).getPolicyName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUser.PolicyProperty):
          PolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyProperty):
          software.amazon.awscdk.services.iam.CfnUser.PolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
