@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DatabaseProxyAttributes {
  public fun dbProxyArn(): String

  public fun dbProxyName(): String

  public fun endpoint(): String

  public fun securityGroups(): List<ISecurityGroup>

  @CdkDslMarker
  public interface Builder {
    public fun dbProxyArn(dbProxyArn: String)

    public fun dbProxyName(dbProxyName: String)

    public fun endpoint(endpoint: String)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseProxyAttributes.Builder =
        software.amazon.awscdk.services.rds.DatabaseProxyAttributes.builder()

    override fun dbProxyArn(dbProxyArn: String) {
      cdkBuilder.dbProxyArn(dbProxyArn)
    }

    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    public fun build(): software.amazon.awscdk.services.rds.DatabaseProxyAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.DatabaseProxyAttributes,
  ) : CdkObject(cdkObject), DatabaseProxyAttributes {
    override fun dbProxyArn(): String = unwrap(this).getDbProxyArn()

    override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    override fun endpoint(): String = unwrap(this).getEndpoint()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseProxyAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseProxyAttributes):
        DatabaseProxyAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseProxyAttributes):
        software.amazon.awscdk.services.rds.DatabaseProxyAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.DatabaseProxyAttributes
  }
}
