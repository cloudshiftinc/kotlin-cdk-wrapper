package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPackagingGroupProps {
  /**
   * Parameters for CDN authorization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-authorization)
   */
  public fun authorization(): Any? = unwrap(this).getAuthorization()

  /**
   * The configuration parameters for egress access logging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-egressaccesslogs)
   */
  public fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

  /**
   * Unique identifier that you assign to the packaging group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-id)
   */
  public fun id(): String

  /**
   * The tags to assign to the packaging group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPackagingGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorization Parameters for CDN authorization.
     */
    public fun authorization(authorization: IResolvable)

    /**
     * @param authorization Parameters for CDN authorization.
     */
    public fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty)

    /**
     * @param authorization Parameters for CDN authorization.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6f5d48344104b06e8470d4a1e1ef1dd67aa13f06221da391424387a3bf9cd69")
    public
        fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty.Builder.() -> Unit)

    /**
     * @param egressAccessLogs The configuration parameters for egress access logging.
     */
    public fun egressAccessLogs(egressAccessLogs: IResolvable)

    /**
     * @param egressAccessLogs The configuration parameters for egress access logging.
     */
    public fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty)

    /**
     * @param egressAccessLogs The configuration parameters for egress access logging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fdd57a6044873effdf8f64219020568cb08229297110754c5753695239faa54")
    public
        fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty.Builder.() -> Unit)

    /**
     * @param id Unique identifier that you assign to the packaging group. 
     */
    public fun id(id: String)

    /**
     * @param tags The tags to assign to the packaging group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to the packaging group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps.Builder =
        software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps.builder()

    /**
     * @param authorization Parameters for CDN authorization.
     */
    override fun authorization(authorization: IResolvable) {
      cdkBuilder.authorization(authorization.let(IResolvable::unwrap))
    }

    /**
     * @param authorization Parameters for CDN authorization.
     */
    override fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty) {
      cdkBuilder.authorization(authorization.let(CfnPackagingGroup.AuthorizationProperty::unwrap))
    }

    /**
     * @param authorization Parameters for CDN authorization.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6f5d48344104b06e8470d4a1e1ef1dd67aa13f06221da391424387a3bf9cd69")
    override
        fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty.Builder.() -> Unit):
        Unit = authorization(CfnPackagingGroup.AuthorizationProperty(authorization))

    /**
     * @param egressAccessLogs The configuration parameters for egress access logging.
     */
    override fun egressAccessLogs(egressAccessLogs: IResolvable) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(IResolvable::unwrap))
    }

    /**
     * @param egressAccessLogs The configuration parameters for egress access logging.
     */
    override fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(CfnPackagingGroup.LogConfigurationProperty::unwrap))
    }

    /**
     * @param egressAccessLogs The configuration parameters for egress access logging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fdd57a6044873effdf8f64219020568cb08229297110754c5753695239faa54")
    override
        fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty.Builder.() -> Unit):
        Unit = egressAccessLogs(CfnPackagingGroup.LogConfigurationProperty(egressAccessLogs))

    /**
     * @param id Unique identifier that you assign to the packaging group. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param tags The tags to assign to the packaging group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to assign to the packaging group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps,
  ) : CdkObject(cdkObject), CfnPackagingGroupProps {
    /**
     * Parameters for CDN authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-authorization)
     */
    override fun authorization(): Any? = unwrap(this).getAuthorization()

    /**
     * The configuration parameters for egress access logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-egressaccesslogs)
     */
    override fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

    /**
     * Unique identifier that you assign to the packaging group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-id)
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * The tags to assign to the packaging group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPackagingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps):
        CfnPackagingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPackagingGroupProps):
        software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps
  }
}
