package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DatabaseProxyAttributes {
  public fun dbProxyArn(): String

  public fun dbProxyName(): String

  public fun endpoint(): String

  public fun securityGroups(): List<ISecurityGroup>

  public interface Builder {
    public fun dbProxyArn(dbProxyArn: String) {
    }

    public fun dbProxyName(dbProxyName: String) {
    }

    public fun endpoint(endpoint: String) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseProxyAttributes.Builder =
        software.amazon.awscdk.services.rds.DatabaseProxyAttributes.builder()

    public override fun dbProxyArn(dbProxyArn: String) {
      cdkBuilder.dbProxyArn(dbProxyArn)
    }

    public override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    public override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.DatabaseProxyAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.DatabaseProxyAttributes,
  ) : DatabaseProxyAttributes {
    public override fun dbProxyArn(): String = unwrap(this).getDbProxyArn()

    public override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    public override fun endpoint(): String = unwrap(this).getEndpoint()

    public override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseProxyAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseProxyAttributes):
        DatabaseProxyAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseProxyAttributes):
        software.amazon.awscdk.services.rds.DatabaseProxyAttributes = (wrapped as Wrapper).cdkObject
  }
}
