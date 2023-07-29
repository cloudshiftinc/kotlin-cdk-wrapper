@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.apigateway.BasePathMapping
import software.amazon.awscdk.services.apigateway.IDomainName
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.Stage
import software.constructs.Construct

/**
 * This resource creates a base path that clients who call your API must use in the invocation URL.
 *
 * Unless you're importing a domain with `DomainName.fromDomainNameAttributes()`, you can use
 * `DomainName.addBasePathMapping()` to define mappings.
 *
 * Example:
 * ```
 * RestApi api;
 * IDomainName domainName = DomainName.fromDomainNameAttributes(this, "DomainName",
 * DomainNameAttributes.builder()
 * .domainName("domainName")
 * .domainNameAliasHostedZoneId("domainNameAliasHostedZoneId")
 * .domainNameAliasTarget("domainNameAliasTarget")
 * .build());
 * BasePathMapping.Builder.create(this, "BasePathMapping")
 * .domainName(domainName)
 * .restApi(api)
 * .build();
 * ```
 */
@CdkDslMarker
public class BasePathMappingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: BasePathMapping.Builder = BasePathMapping.Builder.create(scope, id)

    /**
     * Whether to attach the base path mapping to a stage.
     *
     * Use this property to create a base path mapping without attaching it to the Rest API default
     * stage. This property is ignored if `stage` is provided.
     *
     * Default: - true
     *
     * @param attachToStage Whether to attach the base path mapping to a stage.
     */
    public fun attachToStage(attachToStage: Boolean) {
        cdkBuilder.attachToStage(attachToStage)
    }

    /**
     * The base path name that callers of the API must provide in the URL after the domain name
     * (e.g. `example.com/base-path`). If you specify this property, it can't be an empty string.
     *
     * Default: - map requests from the domain root (e.g. `example.com`). If this is undefined, no
     * additional mappings will be allowed on this domain name.
     *
     * @param basePath The base path name that callers of the API must provide in the URL after the
     *   domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an
     *   empty string.
     */
    public fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
    }

    /**
     * The DomainName to associate with this base path mapping.
     *
     * @param domainName The DomainName to associate with this base path mapping.
     */
    public fun domainName(domainName: IDomainName) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The RestApi resource to target.
     *
     * @param restApi The RestApi resource to target.
     */
    public fun restApi(restApi: IRestApi) {
        cdkBuilder.restApi(restApi)
    }

    /**
     * The Deployment stage of API [disable-awslint:ref-via-interface].
     *
     * Default: - map to deploymentStage of restApi otherwise stage needs to pass in URL
     *
     * @param stage The Deployment stage of API [disable-awslint:ref-via-interface].
     */
    public fun stage(stage: Stage) {
        cdkBuilder.stage(stage)
    }

    public fun build(): BasePathMapping = cdkBuilder.build()
}
