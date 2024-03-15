@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBProxy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy,
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

  public open fun auth(vararg __idx_ac66f0: Any): Unit = auth(__idx_ac66f0.toList())

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

  public open fun tags(vararg `value`: TagFormatProperty): Unit = tags(`value`.toList())

  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  public open fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds()

  public open fun vpcSubnetIds(`value`: List<String>) {
    unwrap(this).setVpcSubnetIds(`value`)
  }

  public open fun vpcSubnetIds(vararg `value`: String): Unit = vpcSubnetIds(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun auth(auth: IResolvable)

    public fun auth(auth: List<Any>)

    public fun auth(vararg auth: Any)

    public fun dbProxyName(dbProxyName: String)

    public fun debugLogging(debugLogging: Boolean)

    public fun debugLogging(debugLogging: IResolvable)

    public fun engineFamily(engineFamily: String)

    public fun idleClientTimeout(idleClientTimeout: Number)

    public fun requireTls(requireTls: Boolean)

    public fun requireTls(requireTls: IResolvable)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<TagFormatProperty>)

    public fun tags(vararg tags: TagFormatProperty)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)

    public fun vpcSubnetIds(vpcSubnetIds: List<String>)

    public fun vpcSubnetIds(vararg vpcSubnetIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxy.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxy.Builder.create(scope, id)

    override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable::unwrap))
    }

    override fun auth(auth: List<Any>) {
      cdkBuilder.auth(auth)
    }

    override fun auth(vararg auth: Any): Unit = auth(auth.toList())

    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    override fun debugLogging(debugLogging: Boolean) {
      cdkBuilder.debugLogging(debugLogging)
    }

    override fun debugLogging(debugLogging: IResolvable) {
      cdkBuilder.debugLogging(debugLogging.let(IResolvable::unwrap))
    }

    override fun engineFamily(engineFamily: String) {
      cdkBuilder.engineFamily(engineFamily)
    }

    override fun idleClientTimeout(idleClientTimeout: Number) {
      cdkBuilder.idleClientTimeout(idleClientTimeout)
    }

    override fun requireTls(requireTls: Boolean) {
      cdkBuilder.requireTls(requireTls)
    }

    override fun requireTls(requireTls: IResolvable) {
      cdkBuilder.requireTls(requireTls.let(IResolvable::unwrap))
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<TagFormatProperty>) {
      cdkBuilder.tags(tags.map(TagFormatProperty::unwrap))
    }

    override fun tags(vararg tags: TagFormatProperty): Unit = tags(tags.toList())

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    override fun vpcSubnetIds(vpcSubnetIds: List<String>) {
      cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    override fun vpcSubnetIds(vararg vpcSubnetIds: String): Unit =
        vpcSubnetIds(vpcSubnetIds.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBProxy.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun authScheme(authScheme: String)

      public fun clientPasswordAuthType(clientPasswordAuthType: String)

      public fun description(description: String)

      public fun iamAuth(iamAuth: String)

      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty.builder()

      override fun authScheme(authScheme: String) {
        cdkBuilder.authScheme(authScheme)
      }

      override fun clientPasswordAuthType(clientPasswordAuthType: String) {
        cdkBuilder.clientPasswordAuthType(clientPasswordAuthType)
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun iamAuth(iamAuth: String) {
        cdkBuilder.iamAuth(iamAuth)
      }

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty,
    ) : CdkObject(cdkObject), AuthFormatProperty {
      override fun authScheme(): String? = unwrap(this).getAuthScheme()

      override fun clientPasswordAuthType(): String? = unwrap(this).getClientPasswordAuthType()

      override fun description(): String? = unwrap(this).getDescription()

      override fun iamAuth(): String? = unwrap(this).getIamAuth()

      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty):
          AuthFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthFormatProperty):
          software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBProxy.AuthFormatProperty
    }
  }

  public interface TagFormatProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty,
    ) : CdkObject(cdkObject), TagFormatProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty):
          TagFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFormatProperty):
          software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty
    }
  }
}
