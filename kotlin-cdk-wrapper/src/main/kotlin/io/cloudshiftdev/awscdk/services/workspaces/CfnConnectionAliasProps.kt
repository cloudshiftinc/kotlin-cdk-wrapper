@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspaces

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnConnectionAlias`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspaces.*;
 * CfnConnectionAliasProps cfnConnectionAliasProps = CfnConnectionAliasProps.builder()
 * .connectionString("connectionString")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html)
 */
public interface CfnConnectionAliasProps {
  /**
   * The connection string specified for the connection alias.
   *
   * The connection string must be in the form of a fully qualified domain name (FQDN), such as
   * `www.example.com` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-connectionstring)
   */
  public fun connectionString(): String

  /**
   * The tags to associate with the connection alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnConnectionAliasProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionString The connection string specified for the connection alias. 
     * The connection string must be in the form of a fully qualified domain name (FQDN), such as
     * `www.example.com` .
     */
    public fun connectionString(connectionString: String)

    /**
     * @param tags The tags to associate with the connection alias.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to associate with the connection alias.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps.Builder =
        software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps.builder()

    /**
     * @param connectionString The connection string specified for the connection alias. 
     * The connection string must be in the form of a fully qualified domain name (FQDN), such as
     * `www.example.com` .
     */
    override fun connectionString(connectionString: String) {
      cdkBuilder.connectionString(connectionString)
    }

    /**
     * @param tags The tags to associate with the connection alias.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to associate with the connection alias.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps,
  ) : CdkObject(cdkObject), CfnConnectionAliasProps {
    /**
     * The connection string specified for the connection alias.
     *
     * The connection string must be in the form of a fully qualified domain name (FQDN), such as
     * `www.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-connectionstring)
     */
    override fun connectionString(): String = unwrap(this).getConnectionString()

    /**
     * The tags to associate with the connection alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps):
        CfnConnectionAliasProps = CdkObjectWrappers.wrap(cdkObject) as CfnConnectionAliasProps

    internal fun unwrap(wrapped: CfnConnectionAliasProps):
        software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps
  }
}
