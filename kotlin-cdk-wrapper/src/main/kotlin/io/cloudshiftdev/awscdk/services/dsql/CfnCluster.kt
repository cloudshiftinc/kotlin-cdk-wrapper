@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dsql

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DSQL::Cluster` resource specifies an cluster. You can use this resource to create,
 * modify, and manage clusters.
 *
 * This resource supports both single-Region clusters and multi-Region clusters through the
 * `MultiRegionProperties` parameter.
 *
 *
 * Creating multi-Region clusters requires additional IAM permissions beyond those needed for
 * single-Region clusters. &gt; - The witness Region specified in `multiRegionProperties.witnessRegion`
 * cannot be the same as the cluster's Region.
 *
 *
 * *Required permissions*
 *
 * * **dsql:CreateCluster** - Required to create a cluster.
 *
 * Resources: `arn:aws:dsql:region:account-id:cluster/ *`
 *
 * * **dsql:TagResource** - Permission to add tags to a resource.
 *
 * Resources: `arn:aws:dsql:region:account-id:cluster/ *`
 *
 * * **dsql:PutMultiRegionProperties** - Permission to configure multi-Region properties for a
 * cluster.
 *
 * Resources: `arn:aws:dsql:region:account-id:cluster/ *`
 *
 * * **dsql:AddPeerCluster** - When specifying `multiRegionProperties.clusters` , permission to add
 * peer clusters.
 *
 * Resources:
 *
 * * Local cluster: `arn:aws:dsql:region:account-id:cluster/ *`
 * * Each peer cluster: exact ARN of each specified peer cluster
 * * **dsql:PutWitnessRegion** - When specifying `multiRegionProperties.witnessRegion` , permission
 * to set a witness Region. This permission is checked both in the cluster Region and in the witness
 * Region.
 *
 * Resources: `arn:aws:dsql:region:account-id:cluster/ *`
 *
 * Condition Keys: `dsql:WitnessRegion` (matching the specified witness region)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dsql.*;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
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
public open class CfnCluster(
  cdkObject: software.amazon.awscdk.services.dsql.CfnCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.dsql.CfnCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps,
  ) :
      this(software.amazon.awscdk.services.dsql.CfnCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClusterProps(props)
  )

  /**
   * The timestamp when the cluster was created, in ISO 8601 format.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The encryption configuration details for the cluster.
   */
  public open fun attrEncryptionDetails(): IResolvable =
      unwrap(this).getAttrEncryptionDetails().let(IResolvable::wrap)

  /**
   * The unique identifier assigned to the cluster upon creation.
   */
  public open fun attrIdentifier(): String = unwrap(this).getAttrIdentifier()

  /**
   * The Amazon Resource Name (ARN) of the cluster.
   *
   * Used for IAM permissions and resource identification.
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * The current status of the cluster. Possible values include: CREATING, ACTIVE, DELETING, FAILED.
   *
   * The cluster can have two additional status values when working with multi-Region clusters:
   *
   * `PENDING_SETUP` —Indicates the cluster is being configured
   *
   * `PENDING_DELETE` —Indicates the cluster is being deleted
   *
   * *Note:* These status values only appear for multi-Region cluster operations.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The VPC Endpoint Service name for the cluster.
   *
   * This can be used to create a VPC endpoint to connect to the cluster from within a VPC.
   */
  public open fun attrVpcEndpointServiceName(): String =
      unwrap(this).getAttrVpcEndpointServiceName()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Whether deletion protection is enabled on this cluster.
   */
  public open fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

  /**
   * Whether deletion protection is enabled on this cluster.
   */
  public open fun deletionProtectionEnabled(`value`: Boolean) {
    unwrap(this).setDeletionProtectionEnabled(`value`)
  }

  /**
   * Whether deletion protection is enabled on this cluster.
   */
  public open fun deletionProtectionEnabled(`value`: IResolvable) {
    unwrap(this).setDeletionProtectionEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The KMS key that encrypts data on the cluster.
   */
  public open fun kmsEncryptionKey(): String? = unwrap(this).getKmsEncryptionKey()

  /**
   * The KMS key that encrypts data on the cluster.
   */
  public open fun kmsEncryptionKey(`value`: String) {
    unwrap(this).setKmsEncryptionKey(`value`)
  }

  /**
   * Defines the structure for multi-Region cluster configurations, containing the witness Region
   * and peered cluster settings.
   */
  public open fun multiRegionProperties(): Any? = unwrap(this).getMultiRegionProperties()

  /**
   * Defines the structure for multi-Region cluster configurations, containing the witness Region
   * and peered cluster settings.
   */
  public open fun multiRegionProperties(`value`: IResolvable) {
    unwrap(this).setMultiRegionProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Defines the structure for multi-Region cluster configurations, containing the witness Region
   * and peered cluster settings.
   */
  public open fun multiRegionProperties(`value`: MultiRegionPropertiesProperty) {
    unwrap(this).setMultiRegionProperties(`value`.let(MultiRegionPropertiesProperty.Companion::unwrap))
  }

  /**
   * Defines the structure for multi-Region cluster configurations, containing the witness Region
   * and peered cluster settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0df54592bba4426950118a001f11cdaae52822e8bfb29c44d0bd9127e67c9376")
  public open fun multiRegionProperties(`value`: MultiRegionPropertiesProperty.Builder.() -> Unit):
      Unit = multiRegionProperties(MultiRegionPropertiesProperty(`value`))

  /**
   * A map of key and value pairs this cluster is tagged with.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A map of key and value pairs this cluster is tagged with.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A map of key and value pairs this cluster is tagged with.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dsql.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether deletion protection is enabled on this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-deletionprotectionenabled)
     * @param deletionProtectionEnabled Whether deletion protection is enabled on this cluster. 
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean)

    /**
     * Whether deletion protection is enabled on this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-deletionprotectionenabled)
     * @param deletionProtectionEnabled Whether deletion protection is enabled on this cluster. 
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable)

    /**
     * The KMS key that encrypts data on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-kmsencryptionkey)
     * @param kmsEncryptionKey The KMS key that encrypts data on the cluster. 
     */
    public fun kmsEncryptionKey(kmsEncryptionKey: String)

    /**
     * Defines the structure for multi-Region cluster configurations, containing the witness Region
     * and peered cluster settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-multiregionproperties)
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings. 
     */
    public fun multiRegionProperties(multiRegionProperties: IResolvable)

    /**
     * Defines the structure for multi-Region cluster configurations, containing the witness Region
     * and peered cluster settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-multiregionproperties)
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings. 
     */
    public fun multiRegionProperties(multiRegionProperties: MultiRegionPropertiesProperty)

    /**
     * Defines the structure for multi-Region cluster configurations, containing the witness Region
     * and peered cluster settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-multiregionproperties)
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd45caf1731c7aabd1267dc37f68b5bb183ea89fe866b9b59af9c45d6fbc393c")
    public
        fun multiRegionProperties(multiRegionProperties: MultiRegionPropertiesProperty.Builder.() -> Unit)

    /**
     * A map of key and value pairs this cluster is tagged with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-tags)
     * @param tags A map of key and value pairs this cluster is tagged with. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A map of key and value pairs this cluster is tagged with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-tags)
     * @param tags A map of key and value pairs this cluster is tagged with. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dsql.CfnCluster.Builder =
        software.amazon.awscdk.services.dsql.CfnCluster.Builder.create(scope, id)

    /**
     * Whether deletion protection is enabled on this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-deletionprotectionenabled)
     * @param deletionProtectionEnabled Whether deletion protection is enabled on this cluster. 
     */
    override fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
      cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    /**
     * Whether deletion protection is enabled on this cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-deletionprotectionenabled)
     * @param deletionProtectionEnabled Whether deletion protection is enabled on this cluster. 
     */
    override fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
      cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The KMS key that encrypts data on the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-kmsencryptionkey)
     * @param kmsEncryptionKey The KMS key that encrypts data on the cluster. 
     */
    override fun kmsEncryptionKey(kmsEncryptionKey: String) {
      cdkBuilder.kmsEncryptionKey(kmsEncryptionKey)
    }

    /**
     * Defines the structure for multi-Region cluster configurations, containing the witness Region
     * and peered cluster settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-multiregionproperties)
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings. 
     */
    override fun multiRegionProperties(multiRegionProperties: IResolvable) {
      cdkBuilder.multiRegionProperties(multiRegionProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * Defines the structure for multi-Region cluster configurations, containing the witness Region
     * and peered cluster settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-multiregionproperties)
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings. 
     */
    override fun multiRegionProperties(multiRegionProperties: MultiRegionPropertiesProperty) {
      cdkBuilder.multiRegionProperties(multiRegionProperties.let(MultiRegionPropertiesProperty.Companion::unwrap))
    }

    /**
     * Defines the structure for multi-Region cluster configurations, containing the witness Region
     * and peered cluster settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-multiregionproperties)
     * @param multiRegionProperties Defines the structure for multi-Region cluster configurations,
     * containing the witness Region and peered cluster settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd45caf1731c7aabd1267dc37f68b5bb183ea89fe866b9b59af9c45d6fbc393c")
    override
        fun multiRegionProperties(multiRegionProperties: MultiRegionPropertiesProperty.Builder.() -> Unit):
        Unit = multiRegionProperties(MultiRegionPropertiesProperty(multiRegionProperties))

    /**
     * A map of key and value pairs this cluster is tagged with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-tags)
     * @param tags A map of key and value pairs this cluster is tagged with. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A map of key and value pairs this cluster is tagged with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dsql-cluster.html#cfn-dsql-cluster-tags)
     * @param tags A map of key and value pairs this cluster is tagged with. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dsql.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dsql.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dsql.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.dsql.CfnCluster =
        wrapped.cdkObject as software.amazon.awscdk.services.dsql.CfnCluster
  }

  /**
   * Configuration details about encryption for the cluster including the AWS KMS key ARN,
   * encryption type, and encryption status.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dsql.*;
   * EncryptionDetailsProperty encryptionDetailsProperty = EncryptionDetailsProperty.builder()
   * .encryptionStatus("encryptionStatus")
   * .encryptionType("encryptionType")
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-encryptiondetails.html)
   */
  public interface EncryptionDetailsProperty {
    /**
     * The status of encryption for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-encryptiondetails.html#cfn-dsql-cluster-encryptiondetails-encryptionstatus)
     */
    public fun encryptionStatus(): String? = unwrap(this).getEncryptionStatus()

    /**
     * The type of encryption that protects the data on your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-encryptiondetails.html#cfn-dsql-cluster-encryptiondetails-encryptiontype)
     */
    public fun encryptionType(): String? = unwrap(this).getEncryptionType()

    /**
     * The ARN of the AWS KMS key that encrypts data in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-encryptiondetails.html#cfn-dsql-cluster-encryptiondetails-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A builder for [EncryptionDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionStatus The status of encryption for the cluster.
       */
      public fun encryptionStatus(encryptionStatus: String)

      /**
       * @param encryptionType The type of encryption that protects the data on your cluster.
       */
      public fun encryptionType(encryptionType: String)

      /**
       * @param kmsKeyArn The ARN of the AWS KMS key that encrypts data in the cluster.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dsql.CfnCluster.EncryptionDetailsProperty.Builder =
          software.amazon.awscdk.services.dsql.CfnCluster.EncryptionDetailsProperty.builder()

      /**
       * @param encryptionStatus The status of encryption for the cluster.
       */
      override fun encryptionStatus(encryptionStatus: String) {
        cdkBuilder.encryptionStatus(encryptionStatus)
      }

      /**
       * @param encryptionType The type of encryption that protects the data on your cluster.
       */
      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      /**
       * @param kmsKeyArn The ARN of the AWS KMS key that encrypts data in the cluster.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build(): software.amazon.awscdk.services.dsql.CfnCluster.EncryptionDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.dsql.CfnCluster.EncryptionDetailsProperty,
    ) : CdkObject(cdkObject),
        EncryptionDetailsProperty {
      /**
       * The status of encryption for the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-encryptiondetails.html#cfn-dsql-cluster-encryptiondetails-encryptionstatus)
       */
      override fun encryptionStatus(): String? = unwrap(this).getEncryptionStatus()

      /**
       * The type of encryption that protects the data on your cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-encryptiondetails.html#cfn-dsql-cluster-encryptiondetails-encryptiontype)
       */
      override fun encryptionType(): String? = unwrap(this).getEncryptionType()

      /**
       * The ARN of the AWS KMS key that encrypts data in the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-encryptiondetails.html#cfn-dsql-cluster-encryptiondetails-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dsql.CfnCluster.EncryptionDetailsProperty):
          EncryptionDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionDetailsProperty):
          software.amazon.awscdk.services.dsql.CfnCluster.EncryptionDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dsql.CfnCluster.EncryptionDetailsProperty
    }
  }

  /**
   * Defines the structure for multi-Region cluster configurations, containing the witness Region
   * and peered cluster settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dsql.*;
   * MultiRegionPropertiesProperty multiRegionPropertiesProperty =
   * MultiRegionPropertiesProperty.builder()
   * .clusters(List.of("clusters"))
   * .witnessRegion("witnessRegion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-multiregionproperties.html)
   */
  public interface MultiRegionPropertiesProperty {
    /**
     * The set of peered clusters that form the multi-Region cluster configuration.
     *
     * Each peered cluster represents a database instance in a different Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-multiregionproperties.html#cfn-dsql-cluster-multiregionproperties-clusters)
     */
    public fun clusters(): List<String> = unwrap(this).getClusters() ?: emptyList()

    /**
     * The Region that serves as the witness Region for a multi-Region cluster.
     *
     * The witness Region helps maintain cluster consistency and quorum.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-multiregionproperties.html#cfn-dsql-cluster-multiregionproperties-witnessregion)
     */
    public fun witnessRegion(): String? = unwrap(this).getWitnessRegion()

    /**
     * A builder for [MultiRegionPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusters The set of peered clusters that form the multi-Region cluster
       * configuration.
       * Each peered cluster represents a database instance in a different Region.
       */
      public fun clusters(clusters: List<String>)

      /**
       * @param clusters The set of peered clusters that form the multi-Region cluster
       * configuration.
       * Each peered cluster represents a database instance in a different Region.
       */
      public fun clusters(vararg clusters: String)

      /**
       * @param witnessRegion The Region that serves as the witness Region for a multi-Region
       * cluster.
       * The witness Region helps maintain cluster consistency and quorum.
       */
      public fun witnessRegion(witnessRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dsql.CfnCluster.MultiRegionPropertiesProperty.Builder =
          software.amazon.awscdk.services.dsql.CfnCluster.MultiRegionPropertiesProperty.builder()

      /**
       * @param clusters The set of peered clusters that form the multi-Region cluster
       * configuration.
       * Each peered cluster represents a database instance in a different Region.
       */
      override fun clusters(clusters: List<String>) {
        cdkBuilder.clusters(clusters)
      }

      /**
       * @param clusters The set of peered clusters that form the multi-Region cluster
       * configuration.
       * Each peered cluster represents a database instance in a different Region.
       */
      override fun clusters(vararg clusters: String): Unit = clusters(clusters.toList())

      /**
       * @param witnessRegion The Region that serves as the witness Region for a multi-Region
       * cluster.
       * The witness Region helps maintain cluster consistency and quorum.
       */
      override fun witnessRegion(witnessRegion: String) {
        cdkBuilder.witnessRegion(witnessRegion)
      }

      public fun build():
          software.amazon.awscdk.services.dsql.CfnCluster.MultiRegionPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.dsql.CfnCluster.MultiRegionPropertiesProperty,
    ) : CdkObject(cdkObject),
        MultiRegionPropertiesProperty {
      /**
       * The set of peered clusters that form the multi-Region cluster configuration.
       *
       * Each peered cluster represents a database instance in a different Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-multiregionproperties.html#cfn-dsql-cluster-multiregionproperties-clusters)
       */
      override fun clusters(): List<String> = unwrap(this).getClusters() ?: emptyList()

      /**
       * The Region that serves as the witness Region for a multi-Region cluster.
       *
       * The witness Region helps maintain cluster consistency and quorum.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dsql-cluster-multiregionproperties.html#cfn-dsql-cluster-multiregionproperties-witnessregion)
       */
      override fun witnessRegion(): String? = unwrap(this).getWitnessRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MultiRegionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dsql.CfnCluster.MultiRegionPropertiesProperty):
          MultiRegionPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MultiRegionPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiRegionPropertiesProperty):
          software.amazon.awscdk.services.dsql.CfnCluster.MultiRegionPropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dsql.CfnCluster.MultiRegionPropertiesProperty
    }
  }
}
