@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkteam internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrWorkteamName(): String = unwrap(this).getAttrWorkteamName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun memberDefinitions(): Any? = unwrap(this).getMemberDefinitions()

  public open fun memberDefinitions(`value`: IResolvable) {
    unwrap(this).setMemberDefinitions(`value`.let(IResolvable::unwrap))
  }

  public open fun memberDefinitions(__idx_ac66f0: List<Any>) {
    unwrap(this).setMemberDefinitions(__idx_ac66f0)
  }

  public open fun memberDefinitions(vararg __idx_ac66f0: Any): Unit =
      memberDefinitions(__idx_ac66f0.toList())

  public open fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  public open fun notificationConfiguration(`value`: IResolvable) {
    unwrap(this).setNotificationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun notificationConfiguration(`value`: NotificationConfigurationProperty) {
    unwrap(this).setNotificationConfiguration(`value`.let(NotificationConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b4f9648ce0d0ab886d93ea696074e8617fa160fcdf56814b46727711a401d3c1")
  public open
      fun notificationConfiguration(`value`: NotificationConfigurationProperty.Builder.() -> Unit):
      Unit = notificationConfiguration(NotificationConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun workforceName(): String? = unwrap(this).getWorkforceName()

  public open fun workforceName(`value`: String) {
    unwrap(this).setWorkforceName(`value`)
  }

  public open fun workteamName(): String? = unwrap(this).getWorkteamName()

  public open fun workteamName(`value`: String) {
    unwrap(this).setWorkteamName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun memberDefinitions(memberDefinitions: IResolvable)

    public fun memberDefinitions(memberDefinitions: List<Any>)

    public fun memberDefinitions(vararg memberDefinitions: Any)

    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("083cb38abe11109526f7d9c60158b98954de160d78691ac73dde5f8f23605ee2")
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun workforceName(workforceName: String)

    public fun workteamName(workteamName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnWorkteam.Builder =
        software.amazon.awscdk.services.sagemaker.CfnWorkteam.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun memberDefinitions(memberDefinitions: IResolvable) {
      cdkBuilder.memberDefinitions(memberDefinitions.let(IResolvable::unwrap))
    }

    override fun memberDefinitions(memberDefinitions: List<Any>) {
      cdkBuilder.memberDefinitions(memberDefinitions)
    }

    override fun memberDefinitions(vararg memberDefinitions: Any): Unit =
        memberDefinitions(memberDefinitions.toList())

    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(NotificationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("083cb38abe11109526f7d9c60158b98954de160d78691ac73dde5f8f23605ee2")
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(NotificationConfigurationProperty(notificationConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun workforceName(workforceName: String) {
      cdkBuilder.workforceName(workforceName)
    }

    override fun workteamName(workteamName: String) {
      cdkBuilder.workteamName(workteamName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnWorkteam = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnWorkteam.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkteam {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkteam(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam): CfnWorkteam
        = CfnWorkteam(cdkObject)

    internal fun unwrap(wrapped: CfnWorkteam): software.amazon.awscdk.services.sagemaker.CfnWorkteam
        = wrapped.cdkObject
  }

  public interface NotificationConfigurationProperty {
    public fun notificationTopicArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun notificationTopicArn(notificationTopicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty.builder()

      override fun notificationTopicArn(notificationTopicArn: String) {
        cdkBuilder.notificationTopicArn(notificationTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty,
    ) : CdkObject(cdkObject), NotificationConfigurationProperty {
      override fun notificationTopicArn(): String = unwrap(this).getNotificationTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty):
          NotificationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationConfigurationProperty):
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty
    }
  }

  public interface CognitoMemberDefinitionProperty {
    public fun cognitoClientId(): String

    public fun cognitoUserGroup(): String

    public fun cognitoUserPool(): String

    @CdkDslMarker
    public interface Builder {
      public fun cognitoClientId(cognitoClientId: String)

      public fun cognitoUserGroup(cognitoUserGroup: String)

      public fun cognitoUserPool(cognitoUserPool: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty.builder()

      override fun cognitoClientId(cognitoClientId: String) {
        cdkBuilder.cognitoClientId(cognitoClientId)
      }

      override fun cognitoUserGroup(cognitoUserGroup: String) {
        cdkBuilder.cognitoUserGroup(cognitoUserGroup)
      }

      override fun cognitoUserPool(cognitoUserPool: String) {
        cdkBuilder.cognitoUserPool(cognitoUserPool)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty,
    ) : CdkObject(cdkObject), CognitoMemberDefinitionProperty {
      override fun cognitoClientId(): String = unwrap(this).getCognitoClientId()

      override fun cognitoUserGroup(): String = unwrap(this).getCognitoUserGroup()

      override fun cognitoUserPool(): String = unwrap(this).getCognitoUserPool()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoMemberDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty):
          CognitoMemberDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoMemberDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty
    }
  }

  public interface OidcMemberDefinitionProperty {
    public fun oidcGroups(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun oidcGroups(oidcGroups: List<String>)

      public fun oidcGroups(vararg oidcGroups: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty.builder()

      override fun oidcGroups(oidcGroups: List<String>) {
        cdkBuilder.oidcGroups(oidcGroups)
      }

      override fun oidcGroups(vararg oidcGroups: String): Unit = oidcGroups(oidcGroups.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty,
    ) : CdkObject(cdkObject), OidcMemberDefinitionProperty {
      override fun oidcGroups(): List<String> = unwrap(this).getOidcGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OidcMemberDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty):
          OidcMemberDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OidcMemberDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty
    }
  }

  public interface MemberDefinitionProperty {
    public fun cognitoMemberDefinition(): Any? = unwrap(this).getCognitoMemberDefinition()

    public fun oidcMemberDefinition(): Any? = unwrap(this).getOidcMemberDefinition()

    @CdkDslMarker
    public interface Builder {
      public fun cognitoMemberDefinition(cognitoMemberDefinition: IResolvable)

      public fun cognitoMemberDefinition(cognitoMemberDefinition: CognitoMemberDefinitionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d936a3be26a7dcfeba5b0b94a753e20bd47ca892ad5971d4635f88e6d8ac7cf")
      public
          fun cognitoMemberDefinition(cognitoMemberDefinition: CognitoMemberDefinitionProperty.Builder.() -> Unit)

      public fun oidcMemberDefinition(oidcMemberDefinition: IResolvable)

      public fun oidcMemberDefinition(oidcMemberDefinition: OidcMemberDefinitionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8713a5a802d8145a000b18d1466ed8dc1e9bae556ce03ee06a10d3f28b790da9")
      public
          fun oidcMemberDefinition(oidcMemberDefinition: OidcMemberDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty.builder()

      override fun cognitoMemberDefinition(cognitoMemberDefinition: IResolvable) {
        cdkBuilder.cognitoMemberDefinition(cognitoMemberDefinition.let(IResolvable::unwrap))
      }

      override
          fun cognitoMemberDefinition(cognitoMemberDefinition: CognitoMemberDefinitionProperty) {
        cdkBuilder.cognitoMemberDefinition(cognitoMemberDefinition.let(CognitoMemberDefinitionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d936a3be26a7dcfeba5b0b94a753e20bd47ca892ad5971d4635f88e6d8ac7cf")
      override
          fun cognitoMemberDefinition(cognitoMemberDefinition: CognitoMemberDefinitionProperty.Builder.() -> Unit):
          Unit = cognitoMemberDefinition(CognitoMemberDefinitionProperty(cognitoMemberDefinition))

      override fun oidcMemberDefinition(oidcMemberDefinition: IResolvable) {
        cdkBuilder.oidcMemberDefinition(oidcMemberDefinition.let(IResolvable::unwrap))
      }

      override fun oidcMemberDefinition(oidcMemberDefinition: OidcMemberDefinitionProperty) {
        cdkBuilder.oidcMemberDefinition(oidcMemberDefinition.let(OidcMemberDefinitionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8713a5a802d8145a000b18d1466ed8dc1e9bae556ce03ee06a10d3f28b790da9")
      override
          fun oidcMemberDefinition(oidcMemberDefinition: OidcMemberDefinitionProperty.Builder.() -> Unit):
          Unit = oidcMemberDefinition(OidcMemberDefinitionProperty(oidcMemberDefinition))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty,
    ) : CdkObject(cdkObject), MemberDefinitionProperty {
      override fun cognitoMemberDefinition(): Any? = unwrap(this).getCognitoMemberDefinition()

      override fun oidcMemberDefinition(): Any? = unwrap(this).getOidcMemberDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemberDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty):
          MemberDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty
    }
  }
}
