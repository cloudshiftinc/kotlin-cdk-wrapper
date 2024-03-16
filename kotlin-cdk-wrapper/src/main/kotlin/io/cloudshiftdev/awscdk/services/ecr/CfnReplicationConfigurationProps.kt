@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnReplicationConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * CfnReplicationConfigurationProps cfnReplicationConfigurationProps =
 * CfnReplicationConfigurationProps.builder()
 * .replicationConfiguration(ReplicationConfigurationProperty.builder()
 * .rules(List.of(ReplicationRuleProperty.builder()
 * .destinations(List.of(ReplicationDestinationProperty.builder()
 * .region("region")
 * .registryId("registryId")
 * .build()))
 * // the properties below are optional
 * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
 * .filter("filter")
 * .filterType("filterType")
 * .build()))
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html)
 */
public interface CfnReplicationConfigurationProps {
  /**
   * The replication configuration for a registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
   */
  public fun replicationConfiguration(): Any

  /**
   * A builder for [CfnReplicationConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param replicationConfiguration The replication configuration for a registry. 
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    /**
     * @param replicationConfiguration The replication configuration for a registry. 
     */
    public
        fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty)

    /**
     * @param replicationConfiguration The replication configuration for a registry. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("199bcc0a2a6285e92bfced090c98e4d70aff02983be0b96bc3ba27bf74be0dbe")
    public
        fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps.Builder =
        software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps.builder()

    /**
     * @param replicationConfiguration The replication configuration for a registry. 
     */
    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param replicationConfiguration The replication configuration for a registry. 
     */
    override
        fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(CfnReplicationConfiguration.ReplicationConfigurationProperty::unwrap))
    }

    /**
     * @param replicationConfiguration The replication configuration for a registry. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("199bcc0a2a6285e92bfced090c98e4d70aff02983be0b96bc3ba27bf74be0dbe")
    override
        fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit =
        replicationConfiguration(CfnReplicationConfiguration.ReplicationConfigurationProperty(replicationConfiguration))

    public fun build(): software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps,
  ) : CdkObject(cdkObject), CfnReplicationConfigurationProps {
    /**
     * The replication configuration for a registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
     */
    override fun replicationConfiguration(): Any = unwrap(this).getReplicationConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps):
        CfnReplicationConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnReplicationConfigurationProps

    internal fun unwrap(wrapped: CfnReplicationConfigurationProps):
        software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps
  }
}
