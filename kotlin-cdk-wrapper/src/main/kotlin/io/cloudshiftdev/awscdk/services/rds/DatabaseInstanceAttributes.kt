@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties that describe an existing instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * IInstanceEngine instanceEngine;
 * SecurityGroup securityGroup;
 * DatabaseInstanceAttributes databaseInstanceAttributes = DatabaseInstanceAttributes.builder()
 * .instanceEndpointAddress("instanceEndpointAddress")
 * .instanceIdentifier("instanceIdentifier")
 * .port(123)
 * .securityGroups(List.of(securityGroup))
 * // the properties below are optional
 * .engine(instanceEngine)
 * .instanceResourceId("instanceResourceId")
 * .build();
 * ```
 */
public interface DatabaseInstanceAttributes {
  /**
   * The engine of the existing database Instance.
   *
   * Default: - the imported Instance's engine is unknown
   */
  public fun engine(): IInstanceEngine? = unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

  /**
   * The endpoint address.
   */
  public fun instanceEndpointAddress(): String

  /**
   * The instance identifier.
   */
  public fun instanceIdentifier(): String

  /**
   * The AWS Region-unique, immutable identifier for the DB instance.
   *
   * This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB
   * instance is accessed.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#aws-resource-rds-dbinstance-return-values)
   */
  public fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

  /**
   * The database port.
   */
  public fun port(): Number

  /**
   * The security groups of the instance.
   */
  public fun securityGroups(): List<ISecurityGroup>

  /**
   * A builder for [DatabaseInstanceAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param engine The engine of the existing database Instance.
     */
    public fun engine(engine: IInstanceEngine)

    /**
     * @param instanceEndpointAddress The endpoint address. 
     */
    public fun instanceEndpointAddress(instanceEndpointAddress: String)

    /**
     * @param instanceIdentifier The instance identifier. 
     */
    public fun instanceIdentifier(instanceIdentifier: String)

    /**
     * @param instanceResourceId The AWS Region-unique, immutable identifier for the DB instance.
     * This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB
     * instance is accessed.
     */
    public fun instanceResourceId(instanceResourceId: String)

    /**
     * @param port The database port. 
     */
    public fun port(port: Number)

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
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseInstanceAttributes.Builder =
        software.amazon.awscdk.services.rds.DatabaseInstanceAttributes.builder()

    /**
     * @param engine The engine of the existing database Instance.
     */
    override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine.Companion::unwrap))
    }

    /**
     * @param instanceEndpointAddress The endpoint address. 
     */
    override fun instanceEndpointAddress(instanceEndpointAddress: String) {
      cdkBuilder.instanceEndpointAddress(instanceEndpointAddress)
    }

    /**
     * @param instanceIdentifier The instance identifier. 
     */
    override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /**
     * @param instanceResourceId The AWS Region-unique, immutable identifier for the DB instance.
     * This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB
     * instance is accessed.
     */
    override fun instanceResourceId(instanceResourceId: String) {
      cdkBuilder.instanceResourceId(instanceResourceId)
    }

    /**
     * @param port The database port. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
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

    public fun build(): software.amazon.awscdk.services.rds.DatabaseInstanceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceAttributes,
  ) : CdkObject(cdkObject),
      DatabaseInstanceAttributes {
    /**
     * The engine of the existing database Instance.
     *
     * Default: - the imported Instance's engine is unknown
     */
    override fun engine(): IInstanceEngine? = unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

    /**
     * The endpoint address.
     */
    override fun instanceEndpointAddress(): String = unwrap(this).getInstanceEndpointAddress()

    /**
     * The instance identifier.
     */
    override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    /**
     * The AWS Region-unique, immutable identifier for the DB instance.
     *
     * This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB
     * instance is accessed.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#aws-resource-rds-dbinstance-return-values)
     */
    override fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

    /**
     * The database port.
     */
    override fun port(): Number = unwrap(this).getPort()

    /**
     * The security groups of the instance.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInstanceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceAttributes):
        DatabaseInstanceAttributes = CdkObjectWrappers.wrap(cdkObject) as?
        DatabaseInstanceAttributes ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstanceAttributes):
        software.amazon.awscdk.services.rds.DatabaseInstanceAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.DatabaseInstanceAttributes
  }
}
