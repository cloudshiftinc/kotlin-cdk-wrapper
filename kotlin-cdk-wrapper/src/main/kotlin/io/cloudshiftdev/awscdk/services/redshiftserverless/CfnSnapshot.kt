@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshiftserverless

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A snapshot object that contains databases.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
 * CfnSnapshot cfnSnapshot = CfnSnapshot.Builder.create(this, "MyCfnSnapshot")
 * .snapshotName("snapshotName")
 * // the properties below are optional
 * .namespaceName("namespaceName")
 * .retentionPeriod(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html)
 */
public open class CfnSnapshot(
  cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnSnapshot,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSnapshotProps,
  ) :
      this(software.amazon.awscdk.services.redshiftserverless.CfnSnapshot(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSnapshotProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSnapshotProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSnapshotProps(props)
  )

  /**
   * The owner AWS ;
   *
   * account of the snapshot.
   */
  public open fun attrOwnerAccount(): String = unwrap(this).getAttrOwnerAccount()

  /**
   *
   */
  public open fun attrSnapshot(): IResolvable =
      unwrap(this).getAttrSnapshot().let(IResolvable::wrap)

  /**
   * The username of the database within a snapshot.
   */
  public open fun attrSnapshotAdminUsername(): String = unwrap(this).getAttrSnapshotAdminUsername()

  /**
   * The unique identifier of the KMS key used to encrypt the snapshot.
   */
  public open fun attrSnapshotKmsKeyId(): String = unwrap(this).getAttrSnapshotKmsKeyId()

  /**
   * The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
   */
  public open fun attrSnapshotNamespaceArn(): String = unwrap(this).getAttrSnapshotNamespaceArn()

  /**
   * The name of the namepsace.
   */
  public open fun attrSnapshotNamespaceName(): String = unwrap(this).getAttrSnapshotNamespaceName()

  /**
   * The owner AWS ;
   *
   * account of the snapshot.
   */
  public open fun attrSnapshotOwnerAccount(): String = unwrap(this).getAttrSnapshotOwnerAccount()

  /**
   * The retention period of the snapshot created by the scheduled action.
   */
  public open fun attrSnapshotRetentionPeriod(): Number =
      unwrap(this).getAttrSnapshotRetentionPeriod()

  /**
   * The Amazon Resource Name (ARN) of the snapshot.
   */
  public open fun attrSnapshotSnapshotArn(): String = unwrap(this).getAttrSnapshotSnapshotArn()

  /**
   * The timestamp of when the snapshot was created.
   */
  public open fun attrSnapshotSnapshotCreateTime(): String =
      unwrap(this).getAttrSnapshotSnapshotCreateTime()

  /**
   * The name of the snapshot.
   */
  public open fun attrSnapshotSnapshotName(): String = unwrap(this).getAttrSnapshotSnapshotName()

  /**
   * The status of the snapshot.
   */
  public open fun attrSnapshotStatus(): String = unwrap(this).getAttrSnapshotStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the namepsace.
   */
  public open fun namespaceName(): String? = unwrap(this).getNamespaceName()

  /**
   * The name of the namepsace.
   */
  public open fun namespaceName(`value`: String) {
    unwrap(this).setNamespaceName(`value`)
  }

  /**
   * The retention period of the snapshot created by the scheduled action.
   */
  public open fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

  /**
   * The retention period of the snapshot created by the scheduled action.
   */
  public open fun retentionPeriod(`value`: Number) {
    unwrap(this).setRetentionPeriod(`value`)
  }

  /**
   * The name of the snapshot.
   */
  public open fun snapshotName(): String = unwrap(this).getSnapshotName()

  /**
   * The name of the snapshot.
   */
  public open fun snapshotName(`value`: String) {
    unwrap(this).setSnapshotName(`value`)
  }

  /**
   * An array of [Tag
   * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
   * associate with the snapshot.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of [Tag
   * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
   * associate with the snapshot.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of [Tag
   * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
   * associate with the snapshot.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshiftserverless.CfnSnapshot].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the namepsace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-namespacename)
     * @param namespaceName The name of the namepsace. 
     */
    public fun namespaceName(namespaceName: String)

    /**
     * The retention period of the snapshot created by the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-retentionperiod)
     * @param retentionPeriod The retention period of the snapshot created by the scheduled action. 
     */
    public fun retentionPeriod(retentionPeriod: Number)

    /**
     * The name of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-snapshotname)
     * @param snapshotName The name of the snapshot. 
     */
    public fun snapshotName(snapshotName: String)

    /**
     * An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-tags)
     * @param tags An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-tags)
     * @param tags An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshiftserverless.CfnSnapshot.Builder =
        software.amazon.awscdk.services.redshiftserverless.CfnSnapshot.Builder.create(scope, id)

    /**
     * The name of the namepsace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-namespacename)
     * @param namespaceName The name of the namepsace. 
     */
    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    /**
     * The retention period of the snapshot created by the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-retentionperiod)
     * @param retentionPeriod The retention period of the snapshot created by the scheduled action. 
     */
    override fun retentionPeriod(retentionPeriod: Number) {
      cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * The name of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-snapshotname)
     * @param snapshotName The name of the snapshot. 
     */
    override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    /**
     * An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-tags)
     * @param tags An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-tags)
     * @param tags An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshiftserverless.CfnSnapshot =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshiftserverless.CfnSnapshot.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSnapshot {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSnapshot(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnSnapshot):
        CfnSnapshot = CfnSnapshot(cdkObject)

    internal fun unwrap(wrapped: CfnSnapshot):
        software.amazon.awscdk.services.redshiftserverless.CfnSnapshot = wrapped.cdkObject as
        software.amazon.awscdk.services.redshiftserverless.CfnSnapshot
  }

  /**
   * A snapshot object that contains databases.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
   * SnapshotProperty snapshotProperty = SnapshotProperty.builder()
   * .adminUsername("adminUsername")
   * .kmsKeyId("kmsKeyId")
   * .namespaceArn("namespaceArn")
   * .namespaceName("namespaceName")
   * .ownerAccount("ownerAccount")
   * .retentionPeriod(123)
   * .snapshotArn("snapshotArn")
   * .snapshotCreateTime("snapshotCreateTime")
   * .snapshotName("snapshotName")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html)
   */
  public interface SnapshotProperty {
    /**
     * The username of the database within a snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-adminusername)
     */
    public fun adminUsername(): String? = unwrap(this).getAdminUsername()

    /**
     * The unique identifier of the KMS key used to encrypt the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-namespacearn)
     */
    public fun namespaceArn(): String? = unwrap(this).getNamespaceArn()

    /**
     * The name of the namepsace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-namespacename)
     */
    public fun namespaceName(): String? = unwrap(this).getNamespaceName()

    /**
     * The owner AWS ;
     *
     * account of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-owneraccount)
     */
    public fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

    /**
     * The retention period of the snapshot created by the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-retentionperiod)
     */
    public fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

    /**
     * The Amazon Resource Name (ARN) of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-snapshotarn)
     */
    public fun snapshotArn(): String? = unwrap(this).getSnapshotArn()

    /**
     * The timestamp of when the snapshot was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-snapshotcreatetime)
     */
    public fun snapshotCreateTime(): String? = unwrap(this).getSnapshotCreateTime()

    /**
     * The name of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-snapshotname)
     */
    public fun snapshotName(): String? = unwrap(this).getSnapshotName()

    /**
     * The status of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [SnapshotProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adminUsername The username of the database within a snapshot.
       */
      public fun adminUsername(adminUsername: String)

      /**
       * @param kmsKeyId The unique identifier of the KMS key used to encrypt the snapshot.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param namespaceArn The Amazon Resource Name (ARN) of the namespace the snapshot was
       * created from.
       */
      public fun namespaceArn(namespaceArn: String)

      /**
       * @param namespaceName The name of the namepsace.
       */
      public fun namespaceName(namespaceName: String)

      /**
       * @param ownerAccount The owner AWS ;.
       * account of the snapshot.
       */
      public fun ownerAccount(ownerAccount: String)

      /**
       * @param retentionPeriod The retention period of the snapshot created by the scheduled
       * action.
       */
      public fun retentionPeriod(retentionPeriod: Number)

      /**
       * @param snapshotArn The Amazon Resource Name (ARN) of the snapshot.
       */
      public fun snapshotArn(snapshotArn: String)

      /**
       * @param snapshotCreateTime The timestamp of when the snapshot was created.
       */
      public fun snapshotCreateTime(snapshotCreateTime: String)

      /**
       * @param snapshotName The name of the snapshot.
       */
      public fun snapshotName(snapshotName: String)

      /**
       * @param status The status of the snapshot.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnSnapshot.SnapshotProperty.Builder =
          software.amazon.awscdk.services.redshiftserverless.CfnSnapshot.SnapshotProperty.builder()

      /**
       * @param adminUsername The username of the database within a snapshot.
       */
      override fun adminUsername(adminUsername: String) {
        cdkBuilder.adminUsername(adminUsername)
      }

      /**
       * @param kmsKeyId The unique identifier of the KMS key used to encrypt the snapshot.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param namespaceArn The Amazon Resource Name (ARN) of the namespace the snapshot was
       * created from.
       */
      override fun namespaceArn(namespaceArn: String) {
        cdkBuilder.namespaceArn(namespaceArn)
      }

      /**
       * @param namespaceName The name of the namepsace.
       */
      override fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
      }

      /**
       * @param ownerAccount The owner AWS ;.
       * account of the snapshot.
       */
      override fun ownerAccount(ownerAccount: String) {
        cdkBuilder.ownerAccount(ownerAccount)
      }

      /**
       * @param retentionPeriod The retention period of the snapshot created by the scheduled
       * action.
       */
      override fun retentionPeriod(retentionPeriod: Number) {
        cdkBuilder.retentionPeriod(retentionPeriod)
      }

      /**
       * @param snapshotArn The Amazon Resource Name (ARN) of the snapshot.
       */
      override fun snapshotArn(snapshotArn: String) {
        cdkBuilder.snapshotArn(snapshotArn)
      }

      /**
       * @param snapshotCreateTime The timestamp of when the snapshot was created.
       */
      override fun snapshotCreateTime(snapshotCreateTime: String) {
        cdkBuilder.snapshotCreateTime(snapshotCreateTime)
      }

      /**
       * @param snapshotName The name of the snapshot.
       */
      override fun snapshotName(snapshotName: String) {
        cdkBuilder.snapshotName(snapshotName)
      }

      /**
       * @param status The status of the snapshot.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnSnapshot.SnapshotProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnSnapshot.SnapshotProperty,
    ) : CdkObject(cdkObject),
        SnapshotProperty {
      /**
       * The username of the database within a snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-adminusername)
       */
      override fun adminUsername(): String? = unwrap(this).getAdminUsername()

      /**
       * The unique identifier of the KMS key used to encrypt the snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-namespacearn)
       */
      override fun namespaceArn(): String? = unwrap(this).getNamespaceArn()

      /**
       * The name of the namepsace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-namespacename)
       */
      override fun namespaceName(): String? = unwrap(this).getNamespaceName()

      /**
       * The owner AWS ;
       *
       * account of the snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-owneraccount)
       */
      override fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

      /**
       * The retention period of the snapshot created by the scheduled action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-retentionperiod)
       */
      override fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

      /**
       * The Amazon Resource Name (ARN) of the snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-snapshotarn)
       */
      override fun snapshotArn(): String? = unwrap(this).getSnapshotArn()

      /**
       * The timestamp of when the snapshot was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-snapshotcreatetime)
       */
      override fun snapshotCreateTime(): String? = unwrap(this).getSnapshotCreateTime()

      /**
       * The name of the snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-snapshotname)
       */
      override fun snapshotName(): String? = unwrap(this).getSnapshotName()

      /**
       * The status of the snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-snapshot-snapshot.html#cfn-redshiftserverless-snapshot-snapshot-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnapshotProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnSnapshot.SnapshotProperty):
          SnapshotProperty = CdkObjectWrappers.wrap(cdkObject) as? SnapshotProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapshotProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnSnapshot.SnapshotProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnSnapshot.SnapshotProperty
    }
  }
}
