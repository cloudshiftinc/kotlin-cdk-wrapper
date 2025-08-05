@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

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

/**
 * Properties for defining a `CfnGlobalCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnGlobalClusterProps cfnGlobalClusterProps = CfnGlobalClusterProps.builder()
 * .deletionProtection(false)
 * .engine("engine")
 * .engineLifecycleSupport("engineLifecycleSupport")
 * .engineVersion("engineVersion")
 * .globalClusterIdentifier("globalClusterIdentifier")
 * .sourceDbClusterIdentifier("sourceDbClusterIdentifier")
 * .storageEncrypted(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html)
 */
public interface CfnGlobalClusterProps {
  /**
   * Specifies whether to enable deletion protection for the new global database cluster.
   *
   * The global database can't be deleted when deletion protection is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-deletionprotection)
   */
  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  /**
   * The database engine to use for this global database cluster.
   *
   * Valid Values: `aurora-mysql | aurora-postgresql`
   *
   * Constraints:
   *
   * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
   * uses the engine of the source DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-engine)
   */
  public fun engine(): String? = unwrap(this).getEngine()

  /**
   * The life cycle type for this global database cluster.
   *
   *
   * By default, this value is set to `open-source-rds-extended-support` , which enrolls your global
   * cluster into Amazon RDS Extended Support. At the end of standard support, you can avoid charges
   * for Extended Support by setting the value to `open-source-rds-extended-support-disabled` . In this
   * case, creating the global cluster will fail if the DB major version is past its end of standard
   * support date.
   *
   *
   * This setting only applies to Aurora PostgreSQL-based global databases.
   *
   * You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With
   * RDS Extended Support, you can run the selected major engine version on your global cluster past
   * the end of standard support for that engine version. For more information, see [Amazon RDS
   * Extended Support with Amazon
   * Aurora](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html) in the
   * *Amazon Aurora User Guide* .
   *
   * Valid Values: `open-source-rds-extended-support | open-source-rds-extended-support-disabled`
   *
   * Default: `open-source-rds-extended-support`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-enginelifecyclesupport)
   */
  public fun engineLifecycleSupport(): String? = unwrap(this).getEngineLifecycleSupport()

  /**
   * The engine version to use for this global database cluster.
   *
   * Constraints:
   *
   * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
   * uses the engine version of the source DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-engineversion)
   */
  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The cluster identifier for this global database cluster.
   *
   * This parameter is stored as a lowercase string.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-globalclusteridentifier)
   */
  public fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

  /**
   * The Amazon Resource Name (ARN) to use as the primary cluster of the global database.
   *
   * If you provide a value for this parameter, don't specify values for the following settings
   * because Amazon Aurora uses the values from the specified source DB cluster:
   *
   * * `DatabaseName`
   * * `Engine`
   * * `EngineVersion`
   * * `StorageEncrypted`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-sourcedbclusteridentifier)
   */
  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  /**
   * Specifies whether to enable storage encryption for the new global database cluster.
   *
   * Constraints:
   *
   * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
   * uses the setting from the source DB cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-storageencrypted)
   */
  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  /**
   * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
   *
   * For more information, see [Tagging Amazon RDS
   * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
   * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
   * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in the
   * *Amazon Aurora User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnGlobalClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster.
     * The global database can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster.
     * The global database can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: IResolvable)

    /**
     * @param engine The database engine to use for this global database cluster.
     * Valid Values: `aurora-mysql | aurora-postgresql`
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine of the source DB cluster.
     */
    public fun engine(engine: String)

    /**
     * @param engineLifecycleSupport The life cycle type for this global database cluster.
     *
     * By default, this value is set to `open-source-rds-extended-support` , which enrolls your
     * global cluster into Amazon RDS Extended Support. At the end of standard support, you can avoid
     * charges for Extended Support by setting the value to `open-source-rds-extended-support-disabled`
     * . In this case, creating the global cluster will fail if the DB major version is past its end of
     * standard support date.
     *
     *
     * This setting only applies to Aurora PostgreSQL-based global databases.
     *
     * You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With
     * RDS Extended Support, you can run the selected major engine version on your global cluster past
     * the end of standard support for that engine version. For more information, see [Amazon RDS
     * Extended Support with Amazon
     * Aurora](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html) in
     * the *Amazon Aurora User Guide* .
     *
     * Valid Values: `open-source-rds-extended-support | open-source-rds-extended-support-disabled`
     *
     * Default: `open-source-rds-extended-support`
     */
    public fun engineLifecycleSupport(engineLifecycleSupport: String)

    /**
     * @param engineVersion The engine version to use for this global database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine version of the source DB cluster.
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param globalClusterIdentifier The cluster identifier for this global database cluster.
     * This parameter is stored as a lowercase string.
     */
    public fun globalClusterIdentifier(globalClusterIdentifier: String)

    /**
     * @param sourceDbClusterIdentifier The Amazon Resource Name (ARN) to use as the primary cluster
     * of the global database.
     * If you provide a value for this parameter, don't specify values for the following settings
     * because Amazon Aurora uses the values from the specified source DB cluster:
     *
     * * `DatabaseName`
     * * `Engine`
     * * `EngineVersion`
     * * `StorageEncrypted`
     */
    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    /**
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     */
    public fun storageEncrypted(storageEncrypted: Boolean)

    /**
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     */
    public fun storageEncrypted(storageEncrypted: IResolvable)

    /**
     * @param tags Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
     * For more information, see [Tagging Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in
     * the *Amazon Aurora User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
     * For more information, see [Tagging Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in
     * the *Amazon Aurora User Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnGlobalClusterProps.Builder =
        software.amazon.awscdk.services.rds.CfnGlobalClusterProps.builder()

    /**
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster.
     * The global database can't be deleted when deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deletionProtection Specifies whether to enable deletion protection for the new global
     * database cluster.
     * The global database can't be deleted when deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param engine The database engine to use for this global database cluster.
     * Valid Values: `aurora-mysql | aurora-postgresql`
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine of the source DB cluster.
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param engineLifecycleSupport The life cycle type for this global database cluster.
     *
     * By default, this value is set to `open-source-rds-extended-support` , which enrolls your
     * global cluster into Amazon RDS Extended Support. At the end of standard support, you can avoid
     * charges for Extended Support by setting the value to `open-source-rds-extended-support-disabled`
     * . In this case, creating the global cluster will fail if the DB major version is past its end of
     * standard support date.
     *
     *
     * This setting only applies to Aurora PostgreSQL-based global databases.
     *
     * You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With
     * RDS Extended Support, you can run the selected major engine version on your global cluster past
     * the end of standard support for that engine version. For more information, see [Amazon RDS
     * Extended Support with Amazon
     * Aurora](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html) in
     * the *Amazon Aurora User Guide* .
     *
     * Valid Values: `open-source-rds-extended-support | open-source-rds-extended-support-disabled`
     *
     * Default: `open-source-rds-extended-support`
     */
    override fun engineLifecycleSupport(engineLifecycleSupport: String) {
      cdkBuilder.engineLifecycleSupport(engineLifecycleSupport)
    }

    /**
     * @param engineVersion The engine version to use for this global database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine version of the source DB cluster.
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param globalClusterIdentifier The cluster identifier for this global database cluster.
     * This parameter is stored as a lowercase string.
     */
    override fun globalClusterIdentifier(globalClusterIdentifier: String) {
      cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
    }

    /**
     * @param sourceDbClusterIdentifier The Amazon Resource Name (ARN) to use as the primary cluster
     * of the global database.
     * If you provide a value for this parameter, don't specify values for the following settings
     * because Amazon Aurora uses the values from the specified source DB cluster:
     *
     * * `DatabaseName`
     * * `Engine`
     * * `EngineVersion`
     * * `StorageEncrypted`
     */
    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    /**
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     */
    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param storageEncrypted Specifies whether to enable storage encryption for the new global
     * database cluster.
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     */
    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tags Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
     * For more information, see [Tagging Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in
     * the *Amazon Aurora User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
     * For more information, see [Tagging Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in
     * the *Amazon Aurora User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnGlobalClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CfnGlobalClusterProps,
  ) : CdkObject(cdkObject),
      CfnGlobalClusterProps {
    /**
     * Specifies whether to enable deletion protection for the new global database cluster.
     *
     * The global database can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-deletionprotection)
     */
    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    /**
     * The database engine to use for this global database cluster.
     *
     * Valid Values: `aurora-mysql | aurora-postgresql`
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine of the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-engine)
     */
    override fun engine(): String? = unwrap(this).getEngine()

    /**
     * The life cycle type for this global database cluster.
     *
     *
     * By default, this value is set to `open-source-rds-extended-support` , which enrolls your
     * global cluster into Amazon RDS Extended Support. At the end of standard support, you can avoid
     * charges for Extended Support by setting the value to `open-source-rds-extended-support-disabled`
     * . In this case, creating the global cluster will fail if the DB major version is past its end of
     * standard support date.
     *
     *
     * This setting only applies to Aurora PostgreSQL-based global databases.
     *
     * You can use this setting to enroll your global cluster into Amazon RDS Extended Support. With
     * RDS Extended Support, you can run the selected major engine version on your global cluster past
     * the end of standard support for that engine version. For more information, see [Amazon RDS
     * Extended Support with Amazon
     * Aurora](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/extended-support.html) in
     * the *Amazon Aurora User Guide* .
     *
     * Valid Values: `open-source-rds-extended-support | open-source-rds-extended-support-disabled`
     *
     * Default: `open-source-rds-extended-support`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-enginelifecyclesupport)
     */
    override fun engineLifecycleSupport(): String? = unwrap(this).getEngineLifecycleSupport()

    /**
     * The engine version to use for this global database cluster.
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the engine version of the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-engineversion)
     */
    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    /**
     * The cluster identifier for this global database cluster.
     *
     * This parameter is stored as a lowercase string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-globalclusteridentifier)
     */
    override fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

    /**
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database.
     *
     * If you provide a value for this parameter, don't specify values for the following settings
     * because Amazon Aurora uses the values from the specified source DB cluster:
     *
     * * `DatabaseName`
     * * `Engine`
     * * `EngineVersion`
     * * `StorageEncrypted`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-sourcedbclusteridentifier)
     */
    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

    /**
     * Specifies whether to enable storage encryption for the new global database cluster.
     *
     * Constraints:
     *
     * * Can't be specified if `SourceDBClusterIdentifier` is specified. In this case, Amazon Aurora
     * uses the setting from the source DB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-storageencrypted)
     */
    override fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

    /**
     * Metadata assigned to an Amazon RDS resource consisting of a key-value pair.
     *
     * For more information, see [Tagging Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide* or [Tagging Amazon Aurora and Amazon RDS
     * resources](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.html) in
     * the *Amazon Aurora User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-globalcluster.html#cfn-rds-globalcluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGlobalClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnGlobalClusterProps):
        CfnGlobalClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGlobalClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalClusterProps):
        software.amazon.awscdk.services.rds.CfnGlobalClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.CfnGlobalClusterProps
  }
}
