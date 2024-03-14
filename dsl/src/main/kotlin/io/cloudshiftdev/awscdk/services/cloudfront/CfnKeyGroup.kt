package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnKeyGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyGroup,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The identifier for the key group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time when the key group was last modified.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The key group configuration.
   */
  public open fun keyGroupConfig(): Any = unwrap(this).getKeyGroupConfig()

  /**
   * The key group configuration.
   */
  public open fun keyGroupConfig(`value`: IResolvable) {
    unwrap(this).setKeyGroupConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The key group configuration.
   */
  public open fun keyGroupConfig(`value`: KeyGroupConfigProperty) {
    unwrap(this).setKeyGroupConfig(`value`.let(KeyGroupConfigProperty::unwrap))
  }

  /**
   * The key group configuration.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d796b6ad1c66be1ac4b472eb7fc131c5b4aa56ddf92910f70b253b8cfdf63aaa")
  public open fun keyGroupConfig(`value`: KeyGroupConfigProperty.Builder.() -> Unit): Unit =
      keyGroupConfig(KeyGroupConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnKeyGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The key group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html#cfn-cloudfront-keygroup-keygroupconfig)
     * @param keyGroupConfig The key group configuration. 
     */
    public fun keyGroupConfig(keyGroupConfig: IResolvable)

    /**
     * The key group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html#cfn-cloudfront-keygroup-keygroupconfig)
     * @param keyGroupConfig The key group configuration. 
     */
    public fun keyGroupConfig(keyGroupConfig: KeyGroupConfigProperty)

    /**
     * The key group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html#cfn-cloudfront-keygroup-keygroupconfig)
     * @param keyGroupConfig The key group configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9a4a4f05b6de8381284aad156431b9b88f598f84600d29913cf7a91f781bf4a")
    public fun keyGroupConfig(keyGroupConfig: KeyGroupConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnKeyGroup.Builder =
        software.amazon.awscdk.services.cloudfront.CfnKeyGroup.Builder.create(scope, id)

    /**
     * The key group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html#cfn-cloudfront-keygroup-keygroupconfig)
     * @param keyGroupConfig The key group configuration. 
     */
    override fun keyGroupConfig(keyGroupConfig: IResolvable) {
      cdkBuilder.keyGroupConfig(keyGroupConfig.let(IResolvable::unwrap))
    }

    /**
     * The key group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html#cfn-cloudfront-keygroup-keygroupconfig)
     * @param keyGroupConfig The key group configuration. 
     */
    override fun keyGroupConfig(keyGroupConfig: KeyGroupConfigProperty) {
      cdkBuilder.keyGroupConfig(keyGroupConfig.let(KeyGroupConfigProperty::unwrap))
    }

    /**
     * The key group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html#cfn-cloudfront-keygroup-keygroupconfig)
     * @param keyGroupConfig The key group configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9a4a4f05b6de8381284aad156431b9b88f598f84600d29913cf7a91f781bf4a")
    override fun keyGroupConfig(keyGroupConfig: KeyGroupConfigProperty.Builder.() -> Unit): Unit =
        keyGroupConfig(KeyGroupConfigProperty(keyGroupConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnKeyGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnKeyGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKeyGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKeyGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyGroup):
        CfnKeyGroup = CfnKeyGroup(cdkObject)

    internal fun unwrap(wrapped: CfnKeyGroup):
        software.amazon.awscdk.services.cloudfront.CfnKeyGroup = wrapped.cdkObject
  }

  public interface KeyGroupConfigProperty {
    /**
     * A comment to describe the key group.
     *
     * The comment cannot be longer than 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keygroup-keygroupconfig.html#cfn-cloudfront-keygroup-keygroupconfig-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * A list of the identifiers of the public keys in the key group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keygroup-keygroupconfig.html#cfn-cloudfront-keygroup-keygroupconfig-items)
     */
    public fun items(): List<String>

    /**
     * A name to identify the key group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keygroup-keygroupconfig.html#cfn-cloudfront-keygroup-keygroupconfig-name)
     */
    public fun name(): String

    /**
     * A builder for [KeyGroupConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comment A comment to describe the key group.
       * The comment cannot be longer than 128 characters.
       */
      public fun comment(comment: String)

      /**
       * @param items A list of the identifiers of the public keys in the key group. 
       */
      public fun items(items: List<String>)

      /**
       * @param items A list of the identifiers of the public keys in the key group. 
       */
      public fun items(vararg items: String)

      /**
       * @param name A name to identify the key group. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty.builder()

      /**
       * @param comment A comment to describe the key group.
       * The comment cannot be longer than 128 characters.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param items A list of the identifiers of the public keys in the key group. 
       */
      override fun items(items: List<String>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items A list of the identifiers of the public keys in the key group. 
       */
      override fun items(vararg items: String): Unit = items(items.toList())

      /**
       * @param name A name to identify the key group. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty,
    ) : CdkObject(cdkObject), KeyGroupConfigProperty {
      /**
       * A comment to describe the key group.
       *
       * The comment cannot be longer than 128 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keygroup-keygroupconfig.html#cfn-cloudfront-keygroup-keygroupconfig-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * A list of the identifiers of the public keys in the key group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keygroup-keygroupconfig.html#cfn-cloudfront-keygroup-keygroupconfig-items)
       */
      override fun items(): List<String> = unwrap(this).getItems()

      /**
       * A name to identify the key group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keygroup-keygroupconfig.html#cfn-cloudfront-keygroup-keygroupconfig-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty):
          KeyGroupConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyGroupConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty
    }
  }
}
