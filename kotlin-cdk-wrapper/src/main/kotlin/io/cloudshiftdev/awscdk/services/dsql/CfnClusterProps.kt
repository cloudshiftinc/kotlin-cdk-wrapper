@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dsql

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
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dsql.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
 * .deletionProtectionEnabled(false)
 * .kmsEncryptionKey("kmsEncryptionKey")
 * .multiRegionProperties(MultiRegionPropertiesProperty.builder()
 * .clusters(List.of("clusters"))
 * .witnessRegion("witnessRegion")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html)
 */
public interface CfnClusterProps {
  /**
   * Whether deletion protection is enabled on this cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-deletionprotectionenabled)
   */
  public fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

  /**
   * The KMS key that encrypts data on the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-kmsencryptionkey)
   */
  public fun kmsEncryptionKey(): String? = unwrap(this).getKmsEncryptionKey()

  /**
   * Defines the structure for multi-Region cluster configurations, containing the witness Region
   * and peered cluster settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-multiregionproperties)
   */
  public fun multiRegionProperties(): Any? = unwrap(this).getMultiRegionProperties()

  /**
   * A map of key and value pairs this cluster is tagged with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deletionProtectionEnabled Whether deletion protection is enabled on this cluster.
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean)

    /**
     * @param deletionProtectionEnabled Whether deletion protection is enabled on this cluster.
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable)

    /**
     * @param kmsEncryptionKey The KMS key that encrypts data on the cluster.
     */
    public fun kmsEncryptionKey(kmsEncryptionKey: String)

    /**
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings.
     */
    public fun multiRegionProperties(multiRegionProperties: IResolvable)

    /**
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings.
     */
    public
        fun multiRegionProperties(multiRegionProperties: CfnCluster.MultiRegionPropertiesProperty)

    /**
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae992c2501af7b293eb238cd6fc10ac5ef4aec37955070220b588726e2c42d63")
    public
        fun multiRegionProperties(multiRegionProperties: CfnCluster.MultiRegionPropertiesProperty.Builder.() -> Unit)

    /**
     * @param tags A map of key and value pairs this cluster is tagged with.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A map of key and value pairs this cluster is tagged with.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dsql.CfnClusterProps.Builder =
        software.amazon.awscdk.services.dsql.CfnClusterProps.builder()

    /**
     * @param deletionProtectionEnabled Whether deletion protection is enabled on this cluster.
     */
    override fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
      cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    /**
     * @param deletionProtectionEnabled Whether deletion protection is enabled on this cluster.
     */
    override fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
      cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param kmsEncryptionKey The KMS key that encrypts data on the cluster.
     */
    override fun kmsEncryptionKey(kmsEncryptionKey: String) {
      cdkBuilder.kmsEncryptionKey(kmsEncryptionKey)
    }

    /**
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings.
     */
    override fun multiRegionProperties(multiRegionProperties: IResolvable) {
      cdkBuilder.multiRegionProperties(multiRegionProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings.
     */
    override
        fun multiRegionProperties(multiRegionProperties: CfnCluster.MultiRegionPropertiesProperty) {
      cdkBuilder.multiRegionProperties(multiRegionProperties.let(CfnCluster.MultiRegionPropertiesProperty.Companion::unwrap))
    }

    /**
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae992c2501af7b293eb238cd6fc10ac5ef4aec37955070220b588726e2c42d63")
    override
        fun multiRegionProperties(multiRegionProperties: CfnCluster.MultiRegionPropertiesProperty.Builder.() -> Unit):
        Unit =
        multiRegionProperties(CfnCluster.MultiRegionPropertiesProperty(multiRegionProperties))

    /**
     * @param tags A map of key and value pairs this cluster is tagged with.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A map of key and value pairs this cluster is tagged with.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dsql.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dsql.CfnClusterProps,
  ) : CdkObject(cdkObject),
      CfnClusterProps {
    /**
     * Whether deletion protection is enabled on this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-deletionprotectionenabled)
     */
    override fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

    /**
     * The KMS key that encrypts data on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-kmsencryptionkey)
     */
    override fun kmsEncryptionKey(): String? = unwrap(this).getKmsEncryptionKey()

    /**
     * Defines the structure for multi-Region cluster configurations, containing the witness Region
     * and peered cluster settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-multiregionproperties)
     */
    override fun multiRegionProperties(): Any? = unwrap(this).getMultiRegionProperties()

    /**
     * A map of key and value pairs this cluster is tagged with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dsql.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.dsql.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.dsql.CfnClusterProps
  }
}
