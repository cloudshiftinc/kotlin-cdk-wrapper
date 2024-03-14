package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssistant internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistant,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the assistant.
   */
  public open fun attrAssistantArn(): String = unwrap(this).getAttrAssistantArn()

  /**
   * The ID of the Wisdom assistant.
   */
  public open fun attrAssistantId(): String = unwrap(this).getAttrAssistantId()

  /**
   * The description of the assistant.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the assistant.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the assistant.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the assistant.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The configuration information for the customer managed key used for encryption.
   */
  public open fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  /**
   * The configuration information for the customer managed key used for encryption.
   */
  public open fun serverSideEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration information for the customer managed key used for encryption.
   */
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(ServerSideEncryptionConfigurationProperty::unwrap))
  }

  /**
   * The configuration information for the customer managed key used for encryption.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12f58c1f353a9ee7b8ea01860f1a9b615dcb95701311a5a7e183ff0f756b7ce3")
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of assistant.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of assistant.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnAssistant].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-description)
     * @param description The description of the assistant. 
     */
    public fun description(description: String)

    /**
     * The name of the assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-name)
     * @param name The name of the assistant. 
     */
    public fun name(name: String)

    /**
     * The configuration information for the customer managed key used for encryption.
     *
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption. 
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    /**
     * The configuration information for the customer managed key used for encryption.
     *
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption. 
     */
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty)

    /**
     * The configuration information for the customer managed key used for encryption.
     *
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b927a22fbcb8f1bd706654383d90ea62756fa45306ce7b09c58424394d9ceba4")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-type)
     * @param type The type of assistant. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAssistant.Builder =
        software.amazon.awscdk.services.wisdom.CfnAssistant.Builder.create(scope, id)

    /**
     * The description of the assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-description)
     * @param description The description of the assistant. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-name)
     * @param name The name of the assistant. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The configuration information for the customer managed key used for encryption.
     *
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption. 
     */
    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration information for the customer managed key used for encryption.
     *
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption. 
     */
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(ServerSideEncryptionConfigurationProperty::unwrap))
    }

    /**
     * The configuration information for the customer managed key used for encryption.
     *
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-serversideencryptionconfiguration)
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b927a22fbcb8f1bd706654383d90ea62756fa45306ce7b09c58424394d9ceba4")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-type)
     * @param type The type of assistant. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAssistant = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssistant {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssistant(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistant): CfnAssistant
        = CfnAssistant(cdkObject)

    internal fun unwrap(wrapped: CfnAssistant): software.amazon.awscdk.services.wisdom.CfnAssistant
        = wrapped.cdkObject
  }

  public interface ServerSideEncryptionConfigurationProperty {
    /**
     * The customer managed key used for encryption.
     *
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
     * information about valid ID values, see [Key identifiers
     * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the *AWS
     * Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-assistant-serversideencryptionconfiguration.html#cfn-wisdom-assistant-serversideencryptionconfiguration-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [ServerSideEncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The customer managed key used for encryption.
       * The customer managed key must have a policy that allows `kms:CreateGrant` and
       * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use
       * Wisdom with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
       * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
       * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
       * Wisdom for your
       * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
       * information about valid ID values, see [Key identifiers
       * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the
       * *AWS Key Management Service Developer Guide* .
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty.builder()

      /**
       * @param kmsKeyId The customer managed key used for encryption.
       * The customer managed key must have a policy that allows `kms:CreateGrant` and
       * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use
       * Wisdom with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
       * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
       * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
       * Wisdom for your
       * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
       * information about valid ID values, see [Key identifiers
       * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the
       * *AWS Key Management Service Developer Guide* .
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), ServerSideEncryptionConfigurationProperty {
      /**
       * The customer managed key used for encryption.
       *
       * The customer managed key must have a policy that allows `kms:CreateGrant` and
       * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use
       * Wisdom with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
       * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
       * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
       * Wisdom for your
       * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) . For
       * information about valid ID values, see [Key identifiers
       * (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id) in the
       * *AWS Key Management Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-assistant-serversideencryptionconfiguration.html#cfn-wisdom-assistant-serversideencryptionconfiguration-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerSideEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty):
          ServerSideEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty
    }
  }
}
