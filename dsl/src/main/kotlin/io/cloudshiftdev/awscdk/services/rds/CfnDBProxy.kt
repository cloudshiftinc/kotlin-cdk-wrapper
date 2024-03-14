package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBProxy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrDbProxyArn(): String = unwrap(this).getAttrDbProxyArn()

  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  public open fun auth(): Any = unwrap(this).getAuth()

  public open fun auth(`value`: IResolvable) {
    unwrap(this).setAuth(`value`.let(IResolvable::unwrap))
  }

  public open fun auth(__idx_ac66f0: List<Any>) {
    unwrap(this).setAuth(__idx_ac66f0)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun dbProxyName(): String = unwrap(this).getDbProxyName()

  public open fun dbProxyName(`value`: String) {
    unwrap(this).setDbProxyName(`value`)
  }

  public open fun debugLogging(): Any? = unwrap(this).getDebugLogging()

  public open fun debugLogging(`value`: Boolean) {
    unwrap(this).setDebugLogging(`value`)
  }

  public open fun debugLogging(`value`: IResolvable) {
    unwrap(this).setDebugLogging(`value`.let(IResolvable::unwrap))
  }

  public open fun engineFamily(): String = unwrap(this).getEngineFamily()

  public open fun engineFamily(`value`: String) {
    unwrap(this).setEngineFamily(`value`)
  }

  public open fun idleClientTimeout(): Number? = unwrap(this).getIdleClientTimeout()

  public open fun idleClientTimeout(`value`: Number) {
    unwrap(this).setIdleClientTimeout(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun requireTls(): Any? = unwrap(this).getRequireTls()

  public open fun requireTls(`value`: Boolean) {
    unwrap(this).setRequireTls(`value`)
  }

  public open fun requireTls(`value`: IResolvable) {
    unwrap(this).setRequireTls(`value`.let(IResolvable::unwrap))
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun tags(): List<TagFormatProperty> =
      unwrap(this).getTags()?.map(TagFormatProperty::wrap) ?: emptyList()

  public open fun tags(`value`: List<TagFormatProperty>) {
    unwrap(this).setTags(`value`.map(TagFormatProperty::unwrap))
  }

  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  public open fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds() ?: emptyList()

  public open fun vpcSubnetIds(`value`: List<String>) {
    unwrap(this).setVpcSubnetIds(`value`)
  }

  public interface Builder {
    public fun auth(auth: IResolvable) {
    }

    public fun auth(auth: List<Any>) {
    }

    public fun dbProxyName(dbProxyName: String) {
    }

    public fun debugLogging(debugLogging: Boolean) {
    }

    public fun debugLogging(debugLogging: IResolvable) {
    }

    public fun engineFamily(engineFamily: String) {
    }

    public fun idleClientTimeout(idleClientTimeout: Number) {
    }

    public fun requireTls(requireTls: Boolean) {
    }

    public fun requireTls(requireTls: IResolvable) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun tags(tags: List<TagFormatProperty>) {
    }

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
    }

    public fun vpcSubnetIds(vpcSubnetIds: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxy.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxy.Builder.create(scope, id)

    public override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable::unwrap))
    }

    public override fun auth(auth: List<Any>) {
      cdkBuilder.auth(auth)
    }

    public override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    public override fun debugLogging(debugLogging: Boolean) {
      cdkBuilder.debugLogging(debugLogging)
    }

    public override fun debugLogging(debugLogging: IResolvable) {
      cdkBuilder.debugLogging(debugLogging.let(IResolvable::unwrap))
    }

    public override fun engineFamily(engineFamily: String) {
      cdkBuilder.engineFamily(engineFamily)
    }

    public override fun idleClientTimeout(idleClientTimeout: Number) {
      cdkBuilder.idleClientTimeout(idleClientTimeout)
    }

    public override fun requireTls(requireTls: Boolean) {
      cdkBuilder.requireTls(requireTls)
    }

    public override fun requireTls(requireTls: IResolvable) {
      cdkBuilder.requireTls(requireTls.let(IResolvable::unwrap))
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun tags(tags: List<TagFormatProperty>) {
      cdkBuilder.tags(tags.map(TagFormatProperty::unwrap))
    }

    public override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    public override fun vpcSubnetIds(vpcSubnetIds: List<String>) {
      cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBProxy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBProxy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy): CfnDBProxy =
        CfnDBProxy(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxy): software.amazon.awscdk.services.rds.CfnDBProxy =
        wrapped.cdkObject
  }

  public interface AuthFormatProperty {
    public fun authScheme(): String? = unwrap(this).getAuthScheme()

    public fun clientPasswordAuthType(): String? = unwrap(this).getClientPasswordAuthType()

    public fun description(): String? = unwrap(this).getDescription()

    public fun iamAuth(): String? = unwrap(this).getIamAuth()

    public fun secretArn(): String? = unwrap(this).getSecretArn()

    public interface Builder {
      public fun authScheme(authScheme: String) {
      }

      public fun clientPasswordAuthType(clientPasswordAuthType: String) {
      }

      public fun description(description: String) {
      }

      public fun iamAuth(iamAuth: String) {
      }

      public fun secretArn(secretArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty.builder()

      public override fun authScheme(authScheme: String) {
        cdkBuilder.authScheme(authScheme)
      }

      public override fun clientPasswordAuthType(clientPasswordAuthType: String) {
        cdkBuilder.clientPasswordAuthType(clientPasswordAuthType)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun iamAuth(iamAuth: String) {
        cdkBuilder.iamAuth(iamAuth)
      }

      public override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty,
    ) : AuthFormatProperty {
      public override fun authScheme(): String? = unwrap(this).getAuthScheme()

      public override fun clientPasswordAuthType(): String? =
          unwrap(this).getClientPasswordAuthType()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun iamAuth(): String? = unwrap(this).getIamAuth()

      public override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty):
          AuthFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthFormatProperty):
          software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TagFormatProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty,
    ) : TagFormatProperty {
      public override fun key(): String? = unwrap(this).getKey()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty):
          TagFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFormatProperty):
          software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
