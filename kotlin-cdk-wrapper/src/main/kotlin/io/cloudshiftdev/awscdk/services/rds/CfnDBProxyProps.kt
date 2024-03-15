@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDBProxyProps {
  public fun auth(): Any

  public fun dbProxyName(): String

  public fun debugLogging(): Any? = unwrap(this).getDebugLogging()

  public fun engineFamily(): String

  public fun idleClientTimeout(): Number? = unwrap(this).getIdleClientTimeout()

  public fun requireTls(): Any? = unwrap(this).getRequireTls()

  public fun roleArn(): String

  public fun tags(): List<CfnDBProxy.TagFormatProperty> =
      unwrap(this).getTags()?.map(CfnDBProxy.TagFormatProperty::wrap) ?: emptyList()

  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  public fun vpcSubnetIds(): List<String>

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

    public fun tags(tags: List<CfnDBProxy.TagFormatProperty>)

    public fun tags(vararg tags: CfnDBProxy.TagFormatProperty)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)

    public fun vpcSubnetIds(vpcSubnetIds: List<String>)

    public fun vpcSubnetIds(vararg vpcSubnetIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxyProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxyProps.builder()

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

    override fun tags(tags: List<CfnDBProxy.TagFormatProperty>) {
      cdkBuilder.tags(tags.map(CfnDBProxy.TagFormatProperty::unwrap))
    }

    override fun tags(vararg tags: CfnDBProxy.TagFormatProperty): Unit = tags(tags.toList())

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

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyProps,
  ) : CdkObject(cdkObject), CfnDBProxyProps {
    override fun auth(): Any = unwrap(this).getAuth()

    override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    override fun debugLogging(): Any? = unwrap(this).getDebugLogging()

    override fun engineFamily(): String = unwrap(this).getEngineFamily()

    override fun idleClientTimeout(): Number? = unwrap(this).getIdleClientTimeout()

    override fun requireTls(): Any? = unwrap(this).getRequireTls()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnDBProxy.TagFormatProperty> =
        unwrap(this).getTags()?.map(CfnDBProxy.TagFormatProperty::wrap) ?: emptyList()

    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()

    override fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBProxyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyProps):
        CfnDBProxyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxyProps):
        software.amazon.awscdk.services.rds.CfnDBProxyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.CfnDBProxyProps
  }
}
