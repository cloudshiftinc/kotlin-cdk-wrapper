package io.cloudshiftdev.awscdk.services.elasticache

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
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUser internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticache.CfnUser,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessString(): String? = unwrap(this).getAccessString()

  public open fun accessString(`value`: String) {
    unwrap(this).setAccessString(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

  public open fun authenticationMode(`value`: Any) {
    unwrap(this).setAuthenticationMode(`value`)
  }

  public open fun engine(): String = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun noPasswordRequired(): Any? = unwrap(this).getNoPasswordRequired()

  public open fun noPasswordRequired(`value`: Boolean) {
    unwrap(this).setNoPasswordRequired(`value`)
  }

  public open fun noPasswordRequired(`value`: IResolvable) {
    unwrap(this).setNoPasswordRequired(`value`.let(IResolvable::unwrap))
  }

  public open fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

  public open fun passwords(`value`: List<String>) {
    unwrap(this).setPasswords(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun userId(): String = unwrap(this).getUserId()

  public open fun userId(`value`: String) {
    unwrap(this).setUserId(`value`)
  }

  public open fun userName(): String = unwrap(this).getUserName()

  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  public interface Builder {
    public fun accessString(accessString: String)

    public fun authenticationMode(authenticationMode: Any)

    public fun engine(engine: String)

    public fun noPasswordRequired(noPasswordRequired: Boolean)

    public fun noPasswordRequired(noPasswordRequired: IResolvable)

    public fun passwords(passwords: List<String>)

    public fun tags(tags: List<CfnTag>)

    public fun userId(userId: String)

    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnUser.Builder =
        software.amazon.awscdk.services.elasticache.CfnUser.Builder.create(scope, id)

    override fun accessString(accessString: String) {
      cdkBuilder.accessString(accessString)
    }

    override fun authenticationMode(authenticationMode: Any) {
      cdkBuilder.authenticationMode(authenticationMode)
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun noPasswordRequired(noPasswordRequired: Boolean) {
      cdkBuilder.noPasswordRequired(noPasswordRequired)
    }

    override fun noPasswordRequired(noPasswordRequired: IResolvable) {
      cdkBuilder.noPasswordRequired(noPasswordRequired.let(IResolvable::unwrap))
    }

    override fun passwords(passwords: List<String>) {
      cdkBuilder.passwords(passwords)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun userId(userId: String) {
      cdkBuilder.userId(userId)
    }

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnUser = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.elasticache.CfnUser =
        wrapped.cdkObject
  }

  public interface AuthenticationModeProperty {
    public fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

    public fun type(): String

    public interface Builder {
      public fun passwords(passwords: List<String>)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty.Builder =
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty.builder()

      override fun passwords(passwords: List<String>) {
        cdkBuilder.passwords(passwords)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty,
    ) : AuthenticationModeProperty {
      override fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticationModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty):
          AuthenticationModeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationModeProperty):
          software.amazon.awscdk.services.elasticache.CfnUser.AuthenticationModeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
