@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties that describe an existing DB Proxy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * SecurityGroup securityGroup;
 * DatabaseProxyAttributes databaseProxyAttributes = DatabaseProxyAttributes.builder()
 * .dbProxyArn("dbProxyArn")
 * .dbProxyName("dbProxyName")
 * .endpoint("endpoint")
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
public interface DatabaseProxyAttributes {
  /**
   * DB Proxy ARN.
   */
  public fun dbProxyArn(): String

  /**
   * DB Proxy Name.
   */
  public fun dbProxyName(): String

  /**
   * Endpoint.
   */
  public fun endpoint(): String

  /**
   * The security groups of the instance.
   */
  public fun securityGroups(): List<ISecurityGroup>

  /**
   * A builder for [DatabaseProxyAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dbProxyArn DB Proxy ARN. 
     */
    public fun dbProxyArn(dbProxyArn: String)

    /**
     * @param dbProxyName DB Proxy Name. 
     */
    public fun dbProxyName(dbProxyName: String)

    /**
     * @param endpoint Endpoint. 
     */
    public fun endpoint(endpoint: String)

    /**
     * @param securityGroups The security groups of the instance. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups of the instance. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseProxyAttributes.Builder =
        software.amazon.awscdk.services.rds.DatabaseProxyAttributes.builder()

    /**
     * @param dbProxyArn DB Proxy ARN. 
     */
    override fun dbProxyArn(dbProxyArn: String) {
      cdkBuilder.dbProxyArn(dbProxyArn)
    }

    /**
     * @param dbProxyName DB Proxy Name. 
     */
    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * @param endpoint Endpoint. 
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    /**
     * @param securityGroups The security groups of the instance. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups The security groups of the instance. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    public fun build(): software.amazon.awscdk.services.rds.DatabaseProxyAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.DatabaseProxyAttributes,
  ) : CdkObject(cdkObject), DatabaseProxyAttributes {
    /**
     * DB Proxy ARN.
     */
    override fun dbProxyArn(): String = unwrap(this).getDbProxyArn()

    /**
     * DB Proxy Name.
     */
    override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    /**
     * Endpoint.
     */
    override fun endpoint(): String = unwrap(this).getEndpoint()

    /**
     * The security groups of the instance.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseProxyAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseProxyAttributes):
        DatabaseProxyAttributes = CdkObjectWrappers.wrap(cdkObject) as? DatabaseProxyAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseProxyAttributes):
        software.amazon.awscdk.services.rds.DatabaseProxyAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.DatabaseProxyAttributes
  }
}
