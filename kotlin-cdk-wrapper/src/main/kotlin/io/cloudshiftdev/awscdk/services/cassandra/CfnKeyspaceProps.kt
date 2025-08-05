@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cassandra

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnKeyspace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cassandra.*;
 * CfnKeyspaceProps cfnKeyspaceProps = CfnKeyspaceProps.builder()
 * .clientSideTimestampsEnabled(false)
 * .keyspaceName("keyspaceName")
 * .replicationSpecification(ReplicationSpecificationProperty.builder()
 * .regionList(List.of("regionList"))
 * .replicationStrategy("replicationStrategy")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html)
 */
public interface CfnKeyspaceProps {
  /**
   * Indicates whether client-side timestamps are enabled (true) or disabled (false) for all tables
   * in the keyspace.
   *
   * To add a Region to a single-Region keyspace with at least one table, the value must be set to
   * true. After you've enabled client-side timestamps for a table, you can’t disable it again.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-clientsidetimestampsenabled)
   */
  public fun clientSideTimestampsEnabled(): Any? = unwrap(this).getClientSideTimestampsEnabled()

  /**
   * The name of the keyspace to be created.
   *
   * The keyspace name is case sensitive. If you don't specify a name, AWS CloudFormation generates
   * a unique ID and uses that ID for the keyspace name. For more information, see [Name
   * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   * *Length constraints:* Minimum length of 1. Maximum length of 48.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-keyspacename)
   */
  public fun keyspaceName(): String? = unwrap(this).getKeyspaceName()

  /**
   * Specifies the `ReplicationStrategy` of a keyspace. The options are:.
   *
   * * `SINGLE_REGION` for a single Region keyspace (optional) or
   * * `MULTI_REGION` for a multi-Region keyspace
   *
   * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
   * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
   * replicated in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-replicationspecification)
   */
  public fun replicationSpecification(): Any? = unwrap(this).getReplicationSpecification()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnKeyspaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientSideTimestampsEnabled Indicates whether client-side timestamps are enabled
     * (true) or disabled (false) for all tables in the keyspace.
     * To add a Region to a single-Region keyspace with at least one table, the value must be set to
     * true. After you've enabled client-side timestamps for a table, you can’t disable it again.
     */
    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean)

    /**
     * @param clientSideTimestampsEnabled Indicates whether client-side timestamps are enabled
     * (true) or disabled (false) for all tables in the keyspace.
     * To add a Region to a single-Region keyspace with at least one table, the value must be set to
     * true. After you've enabled client-side timestamps for a table, you can’t disable it again.
     */
    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable)

    /**
     * @param keyspaceName The name of the keyspace to be created.
     * The keyspace name is case sensitive. If you don't specify a name, AWS CloudFormation
     * generates a unique ID and uses that ID for the keyspace name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * *Length constraints:* Minimum length of 1. Maximum length of 48.
     */
    public fun keyspaceName(keyspaceName: String)

    /**
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:.
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     */
    public fun replicationSpecification(replicationSpecification: IResolvable)

    /**
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:.
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     */
    public
        fun replicationSpecification(replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty)

    /**
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:.
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30db27c9ea2a3e4fb2961ad2a1434e1894548888258dae4384165ffb9384b226")
    public
        fun replicationSpecification(replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnKeyspaceProps.Builder =
        software.amazon.awscdk.services.cassandra.CfnKeyspaceProps.builder()

    /**
     * @param clientSideTimestampsEnabled Indicates whether client-side timestamps are enabled
     * (true) or disabled (false) for all tables in the keyspace.
     * To add a Region to a single-Region keyspace with at least one table, the value must be set to
     * true. After you've enabled client-side timestamps for a table, you can’t disable it again.
     */
    override fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean) {
      cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled)
    }

    /**
     * @param clientSideTimestampsEnabled Indicates whether client-side timestamps are enabled
     * (true) or disabled (false) for all tables in the keyspace.
     * To add a Region to a single-Region keyspace with at least one table, the value must be set to
     * true. After you've enabled client-side timestamps for a table, you can’t disable it again.
     */
    override fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable) {
      cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param keyspaceName The name of the keyspace to be created.
     * The keyspace name is case sensitive. If you don't specify a name, AWS CloudFormation
     * generates a unique ID and uses that ID for the keyspace name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * *Length constraints:* Minimum length of 1. Maximum length of 48.
     */
    override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    /**
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:.
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     */
    override fun replicationSpecification(replicationSpecification: IResolvable) {
      cdkBuilder.replicationSpecification(replicationSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:.
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     */
    override
        fun replicationSpecification(replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty) {
      cdkBuilder.replicationSpecification(replicationSpecification.let(CfnKeyspace.ReplicationSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:.
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30db27c9ea2a3e4fb2961ad2a1434e1894548888258dae4384165ffb9384b226")
    override
        fun replicationSpecification(replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty.Builder.() -> Unit):
        Unit =
        replicationSpecification(CfnKeyspace.ReplicationSpecificationProperty(replicationSpecification))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cassandra.CfnKeyspaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspaceProps,
  ) : CdkObject(cdkObject),
      CfnKeyspaceProps {
    /**
     * Indicates whether client-side timestamps are enabled (true) or disabled (false) for all
     * tables in the keyspace.
     *
     * To add a Region to a single-Region keyspace with at least one table, the value must be set to
     * true. After you've enabled client-side timestamps for a table, you can’t disable it again.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-clientsidetimestampsenabled)
     */
    override fun clientSideTimestampsEnabled(): Any? = unwrap(this).getClientSideTimestampsEnabled()

    /**
     * The name of the keyspace to be created.
     *
     * The keyspace name is case sensitive. If you don't specify a name, AWS CloudFormation
     * generates a unique ID and uses that ID for the keyspace name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * *Length constraints:* Minimum length of 1. Maximum length of 48.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-keyspacename)
     */
    override fun keyspaceName(): String? = unwrap(this).getKeyspaceName()

    /**
     * Specifies the `ReplicationStrategy` of a keyspace. The options are:.
     *
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-replicationspecification)
     */
    override fun replicationSpecification(): Any? = unwrap(this).getReplicationSpecification()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeyspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspaceProps):
        CfnKeyspaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnKeyspaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeyspaceProps):
        software.amazon.awscdk.services.cassandra.CfnKeyspaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cassandra.CfnKeyspaceProps
  }
}
