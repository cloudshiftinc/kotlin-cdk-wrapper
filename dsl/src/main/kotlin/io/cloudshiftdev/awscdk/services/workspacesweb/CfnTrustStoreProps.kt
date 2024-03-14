package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrustStoreProps {
  /**
   * A list of CA certificates to be added to the trust store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-certificatelist)
   */
  public fun certificateList(): List<String>

  /**
   * The tags to add to the trust store.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnTrustStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateList A list of CA certificates to be added to the trust store. 
     */
    public fun certificateList(certificateList: List<String>)

    /**
     * @param certificateList A list of CA certificates to be added to the trust store. 
     */
    public fun certificateList(vararg certificateList: String)

    /**
     * @param tags The tags to add to the trust store.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the trust store.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps.Builder
        = software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps.builder()

    /**
     * @param certificateList A list of CA certificates to be added to the trust store. 
     */
    override fun certificateList(certificateList: List<String>) {
      cdkBuilder.certificateList(certificateList)
    }

    /**
     * @param certificateList A list of CA certificates to be added to the trust store. 
     */
    override fun certificateList(vararg certificateList: String): Unit =
        certificateList(certificateList.toList())

    /**
     * @param tags The tags to add to the trust store.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to add to the trust store.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps,
  ) : CdkObject(cdkObject), CfnTrustStoreProps {
    /**
     * A list of CA certificates to be added to the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-certificatelist)
     */
    override fun certificateList(): List<String> = unwrap(this).getCertificateList()

    /**
     * The tags to add to the trust store.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrustStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps):
        CfnTrustStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrustStoreProps):
        software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps
  }
}
