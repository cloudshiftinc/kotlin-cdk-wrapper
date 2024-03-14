package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUser internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnUser,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrUserArn(): String = unwrap(this).getAttrUserArn()

  public open fun directoryUserId(): String? = unwrap(this).getDirectoryUserId()

  public open fun directoryUserId(`value`: String) {
    unwrap(this).setDirectoryUserId(`value`)
  }

  public open fun hierarchyGroupArn(): String? = unwrap(this).getHierarchyGroupArn()

  public open fun hierarchyGroupArn(`value`: String) {
    unwrap(this).setHierarchyGroupArn(`value`)
  }

  public open fun identityInfo(): Any? = unwrap(this).getIdentityInfo()

  public open fun identityInfo(`value`: IResolvable) {
    unwrap(this).setIdentityInfo(`value`.let(IResolvable::unwrap))
  }

  public open fun identityInfo(`value`: UserIdentityInfoProperty) {
    unwrap(this).setIdentityInfo(`value`.let(UserIdentityInfoProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff79e441ebbe10588e09a13e2cf1121e56cb3de7540c9846f71f2fb06cdfa5ed")
  public open fun identityInfo(`value`: UserIdentityInfoProperty.Builder.() -> Unit): Unit =
      identityInfo(UserIdentityInfoProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun password(): String? = unwrap(this).getPassword()

  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

  public open fun phoneConfig(): Any = unwrap(this).getPhoneConfig()

  public open fun phoneConfig(`value`: IResolvable) {
    unwrap(this).setPhoneConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun phoneConfig(`value`: UserPhoneConfigProperty) {
    unwrap(this).setPhoneConfig(`value`.let(UserPhoneConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("af736fefd737d248289e55f54f4616fd734d12ba10ccd63453474bb0456961bd")
  public open fun phoneConfig(`value`: UserPhoneConfigProperty.Builder.() -> Unit): Unit =
      phoneConfig(UserPhoneConfigProperty(`value`))

  public open fun routingProfileArn(): String = unwrap(this).getRoutingProfileArn()

  public open fun routingProfileArn(`value`: String) {
    unwrap(this).setRoutingProfileArn(`value`)
  }

  public open fun securityProfileArns(): List<String> = unwrap(this).getSecurityProfileArns() ?:
      emptyList()

  public open fun securityProfileArns(`value`: List<String>) {
    unwrap(this).setSecurityProfileArns(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun userProficiencies(): Any? = unwrap(this).getUserProficiencies()

  public open fun userProficiencies(`value`: IResolvable) {
    unwrap(this).setUserProficiencies(`value`.let(IResolvable::unwrap))
  }

  public open fun userProficiencies(__idx_ac66f0: List<Any>) {
    unwrap(this).setUserProficiencies(__idx_ac66f0)
  }

  public open fun username(): String = unwrap(this).getUsername()

  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  public interface Builder {
    public fun directoryUserId(directoryUserId: String) {
    }

    public fun hierarchyGroupArn(hierarchyGroupArn: String) {
    }

    public fun identityInfo(identityInfo: IResolvable) {
    }

    public fun identityInfo(identityInfo: UserIdentityInfoProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d38519efe9ab8819df44aad45dd3fcf21a2f035505d17447ebc022a463c8ceaa")
    public fun identityInfo(identityInfo: UserIdentityInfoProperty.Builder.() -> Unit) {
    }

    public fun instanceArn(instanceArn: String) {
    }

    public fun password(password: String) {
    }

    public fun phoneConfig(phoneConfig: IResolvable) {
    }

    public fun phoneConfig(phoneConfig: UserPhoneConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a5cc7ef2d9aa0d6fcefd7d98b71f5717effba00a526aae27e382ca3fb1dde29")
    public fun phoneConfig(phoneConfig: UserPhoneConfigProperty.Builder.() -> Unit) {
    }

    public fun routingProfileArn(routingProfileArn: String) {
    }

    public fun securityProfileArns(securityProfileArns: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun userProficiencies(userProficiencies: IResolvable) {
    }

    public fun userProficiencies(userProficiencies: List<Any>) {
    }

    public fun username(username: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnUser.Builder =
        software.amazon.awscdk.services.connect.CfnUser.Builder.create(scope, id)

    public override fun directoryUserId(directoryUserId: String) {
      cdkBuilder.directoryUserId(directoryUserId)
    }

    public override fun hierarchyGroupArn(hierarchyGroupArn: String) {
      cdkBuilder.hierarchyGroupArn(hierarchyGroupArn)
    }

    public override fun identityInfo(identityInfo: IResolvable) {
      cdkBuilder.identityInfo(identityInfo.let(IResolvable::unwrap))
    }

    public override fun identityInfo(identityInfo: UserIdentityInfoProperty) {
      cdkBuilder.identityInfo(identityInfo.let(UserIdentityInfoProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d38519efe9ab8819df44aad45dd3fcf21a2f035505d17447ebc022a463c8ceaa")
    public override fun identityInfo(identityInfo: UserIdentityInfoProperty.Builder.() -> Unit):
        Unit = identityInfo(UserIdentityInfoProperty(identityInfo))

    public override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public override fun password(password: String) {
      cdkBuilder.password(password)
    }

    public override fun phoneConfig(phoneConfig: IResolvable) {
      cdkBuilder.phoneConfig(phoneConfig.let(IResolvable::unwrap))
    }

    public override fun phoneConfig(phoneConfig: UserPhoneConfigProperty) {
      cdkBuilder.phoneConfig(phoneConfig.let(UserPhoneConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a5cc7ef2d9aa0d6fcefd7d98b71f5717effba00a526aae27e382ca3fb1dde29")
    public override fun phoneConfig(phoneConfig: UserPhoneConfigProperty.Builder.() -> Unit): Unit =
        phoneConfig(UserPhoneConfigProperty(phoneConfig))

    public override fun routingProfileArn(routingProfileArn: String) {
      cdkBuilder.routingProfileArn(routingProfileArn)
    }

    public override fun securityProfileArns(securityProfileArns: List<String>) {
      cdkBuilder.securityProfileArns(securityProfileArns)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun userProficiencies(userProficiencies: IResolvable) {
      cdkBuilder.userProficiencies(userProficiencies.let(IResolvable::unwrap))
    }

    public override fun userProficiencies(userProficiencies: List<Any>) {
      cdkBuilder.userProficiencies(userProficiencies)
    }

    public override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnUser = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.connect.CfnUser =
        wrapped.cdkObject
  }

  public interface UserIdentityInfoProperty {
    public fun email(): String? = unwrap(this).getEmail()

    public fun firstName(): String? = unwrap(this).getFirstName()

    public fun lastName(): String? = unwrap(this).getLastName()

    public fun mobile(): String? = unwrap(this).getMobile()

    public fun secondaryEmail(): String? = unwrap(this).getSecondaryEmail()

    public interface Builder {
      public fun email(email: String) {
      }

      public fun firstName(firstName: String) {
      }

      public fun lastName(lastName: String) {
      }

      public fun mobile(mobile: String) {
      }

      public fun secondaryEmail(secondaryEmail: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty.Builder =
          software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty.builder()

      public override fun email(email: String) {
        cdkBuilder.email(email)
      }

      public override fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
      }

      public override fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
      }

      public override fun mobile(mobile: String) {
        cdkBuilder.mobile(mobile)
      }

      public override fun secondaryEmail(secondaryEmail: String) {
        cdkBuilder.secondaryEmail(secondaryEmail)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty,
    ) : UserIdentityInfoProperty {
      public override fun email(): String? = unwrap(this).getEmail()

      public override fun firstName(): String? = unwrap(this).getFirstName()

      public override fun lastName(): String? = unwrap(this).getLastName()

      public override fun mobile(): String? = unwrap(this).getMobile()

      public override fun secondaryEmail(): String? = unwrap(this).getSecondaryEmail()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserIdentityInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty):
          UserIdentityInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserIdentityInfoProperty):
          software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UserProficiencyProperty {
    public fun attributeName(): String

    public fun attributeValue(): String

    public fun level(): Number

    public interface Builder {
      public fun attributeName(attributeName: String) {
      }

      public fun attributeValue(attributeValue: String) {
      }

      public fun level(level: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty.Builder =
          software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty.builder()

      public override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      public override fun attributeValue(attributeValue: String) {
        cdkBuilder.attributeValue(attributeValue)
      }

      public override fun level(level: Number) {
        cdkBuilder.level(level)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty,
    ) : UserProficiencyProperty {
      public override fun attributeName(): String = unwrap(this).getAttributeName()

      public override fun attributeValue(): String = unwrap(this).getAttributeValue()

      public override fun level(): Number = unwrap(this).getLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserProficiencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty):
          UserProficiencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserProficiencyProperty):
          software.amazon.awscdk.services.connect.CfnUser.UserProficiencyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UserPhoneConfigProperty {
    public fun afterContactWorkTimeLimit(): Number? = unwrap(this).getAfterContactWorkTimeLimit()

    public fun autoAccept(): Any? = unwrap(this).getAutoAccept()

    public fun deskPhoneNumber(): String? = unwrap(this).getDeskPhoneNumber()

    public fun phoneType(): String

    public interface Builder {
      public fun afterContactWorkTimeLimit(afterContactWorkTimeLimit: Number) {
      }

      public fun autoAccept(autoAccept: Boolean) {
      }

      public fun autoAccept(autoAccept: IResolvable) {
      }

      public fun deskPhoneNumber(deskPhoneNumber: String) {
      }

      public fun phoneType(phoneType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty.Builder =
          software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty.builder()

      public override fun afterContactWorkTimeLimit(afterContactWorkTimeLimit: Number) {
        cdkBuilder.afterContactWorkTimeLimit(afterContactWorkTimeLimit)
      }

      public override fun autoAccept(autoAccept: Boolean) {
        cdkBuilder.autoAccept(autoAccept)
      }

      public override fun autoAccept(autoAccept: IResolvable) {
        cdkBuilder.autoAccept(autoAccept.let(IResolvable::unwrap))
      }

      public override fun deskPhoneNumber(deskPhoneNumber: String) {
        cdkBuilder.deskPhoneNumber(deskPhoneNumber)
      }

      public override fun phoneType(phoneType: String) {
        cdkBuilder.phoneType(phoneType)
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty,
    ) : UserPhoneConfigProperty {
      public override fun afterContactWorkTimeLimit(): Number? =
          unwrap(this).getAfterContactWorkTimeLimit()

      public override fun autoAccept(): Any? = unwrap(this).getAutoAccept()

      public override fun deskPhoneNumber(): String? = unwrap(this).getDeskPhoneNumber()

      public override fun phoneType(): String = unwrap(this).getPhoneType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserPhoneConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty):
          UserPhoneConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserPhoneConfigProperty):
          software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
