@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codeartifact

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeartifact.CfnDomain
import software.amazon.awscdk.services.codeartifact.CfnDomainProps
import software.amazon.awscdk.services.codeartifact.CfnRepository
import software.amazon.awscdk.services.codeartifact.CfnRepositoryProps
import software.constructs.Construct

public object codeartifact {
  /**
   * The `AWS::CodeArtifact::Domain` resource creates an AWS CodeArtifact domain.
   *
   * CodeArtifact *domains* make it easier to manage multiple repositories across an organization.
   * You can use a domain to apply permissions across many repositories owned by different AWS
   * accounts. For more information about domains, see the [Domain concepts
   * information](https://docs.aws.amazon.com/codeartifact/latest/ug/codeartifact-concepts.html#welcome-concepts-domain)
   * in the *CodeArtifact User Guide* . For more information about the `CreateDomain` API, see
   * [CreateDomain](https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_CreateDomain.html)
   * in the *CodeArtifact API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codeartifact.*;
   * Object permissionsPolicyDocument;
   * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
   * .domainName("domainName")
   * // the properties below are optional
   * .encryptionKey("encryptionKey")
   * .permissionsPolicyDocument(permissionsPolicyDocument)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html)
   */
  public inline fun cfnDomain(
    scope: Construct,
    id: String,
    block: CfnDomainDsl.() -> Unit = {},
  ): CfnDomain {
    val builder = CfnDomainDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDomain`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codeartifact.*;
   * Object permissionsPolicyDocument;
   * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
   * .domainName("domainName")
   * // the properties below are optional
   * .encryptionKey("encryptionKey")
   * .permissionsPolicyDocument(permissionsPolicyDocument)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-domain.html)
   */
  public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
    val builder = CfnDomainPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::CodeArtifact::Repository` resource creates an AWS CodeArtifact repository.
   *
   * CodeArtifact *repositories* contain a set of package versions. For more information about
   * repositories, see the [Repository concepts
   * information](https://docs.aws.amazon.com/codeartifact/latest/ug/codeartifact-concepts.html#welcome-concepts-repository)
   * in the *CodeArtifact User Guide* . For more information about the `CreateRepository` API, see
   * [CreateRepository](https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_CreateRepository.html)
   * in the *CodeArtifact API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codeartifact.*;
   * Object permissionsPolicyDocument;
   * CfnRepository cfnRepository = CfnRepository.Builder.create(this, "MyCfnRepository")
   * .domainName("domainName")
   * .repositoryName("repositoryName")
   * // the properties below are optional
   * .description("description")
   * .domainOwner("domainOwner")
   * .externalConnections(List.of("externalConnections"))
   * .permissionsPolicyDocument(permissionsPolicyDocument)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .upstreams(List.of("upstreams"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html)
   */
  public inline fun cfnRepository(
    scope: Construct,
    id: String,
    block: CfnRepositoryDsl.() -> Unit = {},
  ): CfnRepository {
    val builder = CfnRepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRepository`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codeartifact.*;
   * Object permissionsPolicyDocument;
   * CfnRepositoryProps cfnRepositoryProps = CfnRepositoryProps.builder()
   * .domainName("domainName")
   * .repositoryName("repositoryName")
   * // the properties below are optional
   * .description("description")
   * .domainOwner("domainOwner")
   * .externalConnections(List.of("externalConnections"))
   * .permissionsPolicyDocument(permissionsPolicyDocument)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .upstreams(List.of("upstreams"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html)
   */
  public inline fun cfnRepositoryProps(block: CfnRepositoryPropsDsl.() -> Unit = {}):
      CfnRepositoryProps {
    val builder = CfnRepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
