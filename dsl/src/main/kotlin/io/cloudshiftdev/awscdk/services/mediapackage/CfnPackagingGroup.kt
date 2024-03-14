package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPackagingGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  public open fun authorization(): Any? = unwrap(this).getAuthorization()

  public open fun authorization(`value`: IResolvable) {
    unwrap(this).setAuthorization(`value`.let(IResolvable::unwrap))
  }

  public open fun authorization(`value`: AuthorizationProperty) {
    unwrap(this).setAuthorization(`value`.let(AuthorizationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ed9c4552c9cd492021c082edf18d6af8bb438de9feee99899150fead841664e")
  public open fun authorization(`value`: AuthorizationProperty.Builder.() -> Unit): Unit =
      authorization(AuthorizationProperty(`value`))

  public open fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

  public open fun egressAccessLogs(`value`: IResolvable) {
    unwrap(this).setEgressAccessLogs(`value`.let(IResolvable::unwrap))
  }

  public open fun egressAccessLogs(`value`: LogConfigurationProperty) {
    unwrap(this).setEgressAccessLogs(`value`.let(LogConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45ee764029ffbca0c6df1d63ca890de2099a850f4c6da009ea7aa29ab8a1cf39")
  public open fun egressAccessLogs(`value`: LogConfigurationProperty.Builder.() -> Unit): Unit =
      egressAccessLogs(LogConfigurationProperty(`value`))

  public open fun id(): String = unwrap(this).getId()

  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun authorization(authorization: IResolvable)

    public fun authorization(authorization: AuthorizationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e221a21f62544a45d07d0a67454c628e7b836e81ed13ec14bf2896c52d9c6bd")
    public fun authorization(authorization: AuthorizationProperty.Builder.() -> Unit)

    public fun egressAccessLogs(egressAccessLogs: IResolvable)

    public fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f5eb1f003827cf2ebf3ec2e3053e750252a1826628d0a46903431f6fa94e78d")
    public fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty.Builder.() -> Unit)

    public fun id(id: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.Builder =
        software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.Builder.create(scope, id)

    override fun authorization(authorization: IResolvable) {
      cdkBuilder.authorization(authorization.let(IResolvable::unwrap))
    }

    override fun authorization(authorization: AuthorizationProperty) {
      cdkBuilder.authorization(authorization.let(AuthorizationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e221a21f62544a45d07d0a67454c628e7b836e81ed13ec14bf2896c52d9c6bd")
    override fun authorization(authorization: AuthorizationProperty.Builder.() -> Unit): Unit =
        authorization(AuthorizationProperty(authorization))

    override fun egressAccessLogs(egressAccessLogs: IResolvable) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(IResolvable::unwrap))
    }

    override fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(LogConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f5eb1f003827cf2ebf3ec2e3053e750252a1826628d0a46903431f6fa94e78d")
    override fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty.Builder.() -> Unit):
        Unit = egressAccessLogs(LogConfigurationProperty(egressAccessLogs))

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnPackagingGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPackagingGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPackagingGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingGroup):
        CfnPackagingGroup = CfnPackagingGroup(cdkObject)

    internal fun unwrap(wrapped: CfnPackagingGroup):
        software.amazon.awscdk.services.mediapackage.CfnPackagingGroup = wrapped.cdkObject
  }

  public interface AuthorizationProperty {
    public fun cdnIdentifierSecret(): String

    public fun secretsRoleArn(): String

    public interface Builder {
      public fun cdnIdentifierSecret(cdnIdentifierSecret: String)

      public fun secretsRoleArn(secretsRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty.builder()

      override fun cdnIdentifierSecret(cdnIdentifierSecret: String) {
        cdkBuilder.cdnIdentifierSecret(cdnIdentifierSecret)
      }

      override fun secretsRoleArn(secretsRoleArn: String) {
        cdkBuilder.secretsRoleArn(secretsRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty,
    ) : AuthorizationProperty {
      override fun cdnIdentifierSecret(): String = unwrap(this).getCdnIdentifierSecret()

      override fun secretsRoleArn(): String = unwrap(this).getSecretsRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty):
          AuthorizationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LogConfigurationProperty {
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    public interface Builder {
      public fun logGroupName(logGroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty.builder()

      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty,
    ) : LogConfigurationProperty {
      override fun logGroupName(): String? = unwrap(this).getLogGroupName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty):
          LogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
